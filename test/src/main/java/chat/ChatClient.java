package chat;

import com.sun.source.tree.Scope;

import javax.swing.*;
import java.io.*;
import java.net.Socket;
import java.util.Scanner;

// 내가 쓰는 것
public class ChatClient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("닉네임을 입력해주세요 >> ");
        String name = scanner.next();

        try {
            Socket socket = new Socket("127.0.0.1", 9999);
            // 쓰기
            PrintWriter out = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
            // 다른 사용자꺼 읽어들이는 것
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            // 키보드 입력
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

            String line = null;
            ChatClientThread inputThread = new ChatClientThread(in);
            inputThread.start();

            while ((line = keyboard.readLine()) != null) {
                out.println(name + " : " + line);
                out.flush();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


