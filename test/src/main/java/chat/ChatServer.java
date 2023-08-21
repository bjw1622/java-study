package chat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChatServer {
    public static void main(String[] args) {
        try {
            // 클라이언트가 접속을 하면
            ServerSocket serverSocket = new ServerSocket(9999);
            // 공유 객체에서 쓰레드에 안전한 리스트를 만든다
            List<PrintWriter> outList = Collections.synchronizedList(new ArrayList<>());
            // 사용자가 들어올때마다 생성해야 하니깐
            while (true) {
                // 소켓이 튀어나오고
                Socket socket = serverSocket.accept();
                System.out.println("접속 : " + socket);

                // 소켓을 가지고 쓰레드로 돌아가라
                // 쓰레드 객체가 만들어질 때마다 공유 객체에 추가
                // chatThread가 만들어질 때 마다 다른 클라이언트들의 쓰레드 공유
                ChatServerThread chatThread = new ChatServerThread(socket, outList);
                chatThread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

