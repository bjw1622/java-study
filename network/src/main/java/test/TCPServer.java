package test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) {
        try {
            //  1. Server Socket 생성
            ServerSocket serverSocket = new ServerSocket();

            //  2. 바인딩(Binding)
            // Socket에 InetSocketAddress(IPAddress + port)를 바인딩 한다
            // IPAddress : 0.0.0.0 => 특정 호스트 IP에 바인딩 하지 않는다(모든 IP 주소에 허용)
            // 5000번 포트
            // 10??
            serverSocket.bind(new InetSocketAddress("0.0.0.0", 5000),10);

            //  3. accept
            Socket socket = serverSocket.accept(); // blocking
        } catch (IOException e) {
            throw new RuntimeException("[server] error : " + e);
        }
    }
}
