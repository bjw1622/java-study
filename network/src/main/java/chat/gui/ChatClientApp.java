package chat.gui;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClientApp {

    private static final String SERVER_IP = "127.0.0.1";
    public static final int SERVER_PORT = 9000;
    public static String name = null;
    public static String nickname;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Socket socket = null;

        // 대화명 한글자 이상 입력
        while (true) {
            System.out.println("대화명을 입력하세요.");
            System.out.print("> ");
            name = scanner.nextLine();

            if (name.isEmpty() == false) {
                break;
            }
            System.out.println("대화명은 한글자 이상 입력해야 합니다.\n");
        }

        try {
            socket = new Socket();

            socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));
            log("connected");

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);
            BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));

            System.out.print("닉네임 : ");
            nickname = scanner.nextLine();
            pw.println("join:" + nickname);

            String ack = br.readLine();

            if ("join:ok".equals(ack)) {
                new ChatWindow(name, socket).show();
            }
        } catch (IOException e) {
            System.out.println("[client] error: " + e);
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }

    private static void log(String msg) {
        System.out.println("[client] " + msg);
    }
}
