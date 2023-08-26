package chat;

import java.io.*;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    // Mac ip 변동 이슈로 "0.0.0.0" 허용
    private static final String SERVER_IP = "0.0.0.0";
    private static final int SERVER_PORT = 9000;

    public static void main(String[] args) {
        Scanner scanner = null;
        Socket socket = null;
        try {
            scanner = new Scanner(System.in);
            socket = new Socket();
            socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
            log("connected");
            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            System.out.print("닉네임 설정 >>");
            String nickname = scanner.nextLine();
            pw.println("join:" + nickname);
            String ack = br.readLine();
            if ("join:OK".equals(ack)) {
                System.out.println("채팅에 입장하였습니다");
            }
            new ChatClientThread(socket).start();
            while (true) {
                if (scanner.hasNextLine() == false) {
                    continue;
                }
                System.out.print(">>");
                String check = scanner.nextLine();
                if ("quit".equals(check)) {
                    pw.println("quit");
                    break;
                }
                if ("".equals(check) == false) {
                    pw.println("message:" + check);
                } else if ("".equals(check)) {
                    pw.println("공백은 입력하지 말아주세요.");
                }
            }
        } catch (ConnectException ex) {
            log("서버[" + SERVER_IP + ":" + SERVER_PORT + "]에 연결할 수 없습니다.");
        } catch (Exception ex) {
            log("다음 이유로 프로그램을 종료 합니다 :" + ex);
        } finally {
            try {
                if (scanner != null) {
                    scanner.close();
                }
                if (socket != null && socket.isClosed() == false) {
                    socket.close();
                }
            } catch (IOException e) {
                log("오류가 발생하여 프로그램을 종료합니다. 오류내용 : " + e);
            }
        }
    }

    public static void log(String msg) {
        System.out.println("\n[Chat Client] " + msg);
    }

}