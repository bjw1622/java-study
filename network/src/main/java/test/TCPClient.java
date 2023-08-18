package test;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;


public class TCPClient {
    private static final String SERVER_IP = "192.168.0.127";
    private static final int SERVER_PORT = 1111;

    public static void main(String[] args) {
        Socket socket = null;

        try {
            // 1. 소켓 생성
            socket = new Socket();
            socket.connect(new InetSocketAddress(SERVER_IP, SERVER_PORT));

            InputStream is  = socket.getInputStream();
            OutputStream os = socket.getOutputStream();

            String data = "Hello World";
            os.write(data.getBytes("utf-8"));

            byte[] buffer = new byte[256];
            int readByteCount = is.read(buffer); // blocking
            if(readByteCount == -1){
                System.out.println("[client] closed by server");
                return;
            }
            new String(buffer, 0 , readByteCount, "utf-8");
            System.out.println("[client] received : " + data);
        } catch (SocketException e) {
            System.out.println("[client] suddenly closed by server");
        } catch (IOException e) {
            System.out.println("[client] error : " + e);
        } finally {
            try {
                if(socket != null && !socket.isClosed()){
                    socket.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
