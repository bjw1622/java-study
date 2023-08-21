package chat;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;

public class ChatServerThread extends Thread {
    private String nickname;
    private Socket socket;
    private List<PrintWriter> pwList;


    public ChatServerThread(Socket socket, List<PrintWriter> pwList) {
        this.socket = socket;
        this.pwList = pwList;
    }

    @Override
    public void run() {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            InetSocketAddress remoteSocketAddress = (InetSocketAddress) socket.getLocalSocketAddress();
            ChatServer.log("호스트와 연결되었습니다. [" + remoteSocketAddress.getAddress().getHostAddress() + ":" + remoteSocketAddress.getPort() + "]");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);

            while (true) {
                String request = br.readLine();

                if (request == null) {
                    doQuit(pw);
                    ChatServer.log("클라이언트로 부터 연결 끊킴.");
                    break;
                }
                String[] tokens = request.split(":");

                for (String s : tokens) {
                    System.out.println(s);
                }

                if ("join".equals(tokens[0])) {
                    doJoin(tokens[1], pw);
                } else if ("message".equals(tokens[0])) {
                    doMessage(tokens[1]);
                } else if ("quit".equals(tokens[0])) {
                    doQuit(pw);
                    break;
                } else {
                    ChatServer.log("에러:알 수 없는 요청(" + tokens[0] + ")");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            pw.close();
        }
    }


    private void removeWriter(PrintWriter pw) {
        synchronized (pwList) {
            pwList.remove(pw);
        }
    }

    private void doJoin(String nickName, PrintWriter writer) {
        this.nickname = nickName;
        String data = this.nickname + "님이 입장했습니다.";
        broadcast(data);
        addWriter(writer);
        writer.println("join:ok");
        writer.flush();
    }

    private void doMessage(String message) {
        broadcast(this.nickname + ":" + message);
    }


    private void broadcast(String msg) {
        synchronized (pwList) {
            // 전체 알림 보내기
            for (PrintWriter wt : pwList) {
                wt.println(msg);
            }
        }
    }

    private void addWriter(PrintWriter writer) {
        synchronized (pwList) {
            pwList.add(writer);
        }
    }

    private void doQuit(PrintWriter pw) {
        removeWriter(pw);

        if (this.nickname != null) {
            String data = this.nickname + "님이 퇴장 하였습니다.";
            broadcast(data);
        }
    }

}