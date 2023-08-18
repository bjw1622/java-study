package echo;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    private static final int PORT = 8000;

    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket();

            serverSocket.bind(new InetSocketAddress("0.0.0.0", PORT), 10);
            Log("starts...[port :" + PORT + "]");
            Socket socket = serverSocket.accept(); // blocking

            InetSocketAddress remoteInetSocketAddress = (InetSocketAddress) socket.getRemoteSocketAddress();
            String remoteHostAddress = remoteInetSocketAddress.getAddress().getHostName();

            int remotePort = remoteInetSocketAddress.getPort();
            Log("[server] connected by client [" + remoteHostAddress + " : " + remotePort + "]");

            OutputStream os = socket.getOutputStream();
            InputStream is = socket.getInputStream();

            PrintWriter pw = new PrintWriter(new OutputStreamWriter(os,"utf-8"), true);
            BufferedReader br =  new BufferedReader(new InputStreamReader(is,"utf-8"));

            while (true) {
                String data = br.readLine();
                if(data == null){
                    Log("[server] closed by client");
                    break;
                }

                Log("[server] received :" + data);
                pw.println(data);
            }

        } catch (IOException e) {
            Log("[server] error : " + e);
        } finally {
            try {
                if (serverSocket != null && !serverSocket.isClosed()) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void Log(String message) {
        System.out.println("[EchoServer] " + message);
    }
}
