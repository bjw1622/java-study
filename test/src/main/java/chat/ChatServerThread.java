package chat;

import java.io.*;
import java.net.Socket;
import java.util.List;

class ChatServerThread extends Thread {
    private Socket socket;
    private List<PrintWriter> outList;
    private PrintWriter out;
    private BufferedReader in;

    public ChatServerThread(Socket socket, List<PrintWriter> outList) {
        this.socket = socket;
        this.outList = outList;
        // 1. socket으로 부터 읽어들일 수 있는 객체를 얻는다
        // 2. socket에게 쓰기 위한 객체를 얻는다(현재 연결된 클라이언트에게 쓰는 객체)

        try {
            out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            outList.add(out);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public void run() {
        String line = null;
        try {
            while ((line = in.readLine()) != null) {
                for (int i = 0; i < outList.size(); i++) {
                    PrintWriter o = outList.get(i);
                    o.println(line);
                    o.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                outList.remove(out);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        for (int i = 0; i < outList.size(); i++) {
            PrintWriter o = outList.get(i);
            o.println("어떤 클라이언트가 접속이 끊어졌어요.");
            o.flush();
        }
        try {
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 연결이 끊어졌을 때 모든 사용자에게 연결이 끊어졌다라는 문구 추가
        // 3. 클라이언트가 보낸 메세지를 읽는다
        // 4. 접속된 모든 클라이언트에게 메시지를 보낸다 (현재 접속된 모든 클라이언트에게 쓸 수 있는 객체가 필요하다)
    }
}