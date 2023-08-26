package chat;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer {
    public static final int PORT = 9000;

    public static void main(String[] args) {
        List<PrintWriter> pwList = new ArrayList<>();
        ServerSocket serverSocket = null;

        try {
            serverSocket = new ServerSocket();
            serverSocket.setReuseAddress(true);

            String hostAddress = InetAddress.getLocalHost().getHostAddress();
            serverSocket.bind(new InetSocketAddress(hostAddress, PORT), 5);
            log("연결 Loading : " + hostAddress + " "+PORT);

            while (true) {
                Socket socket = serverSocket.accept();

                Thread thread = new ChatServerThread(socket, pwList);
                thread.start();
            }
        } catch (IOException e) {
            log("IOException : " + e);
        } finally {
            try {
                serverSocket.close();
            } catch (IOException e) {
                log("IOException : " + e);
            }
        }
    }

    public static void log(String msg) {
        System.out.println("[Chat Server]" + msg);
    }

}