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
                ChatThread chatThread = new ChatThread(socket, outList);
                chatThread.start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


class ChatThread extends Thread {
    private Socket socket;
    private List<PrintWriter> outList;
    private PrintWriter out;
    private BufferedReader in;

    public ChatThread(Socket socket, List<PrintWriter> outList) {
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
            while((line = in.readLine()) != null){
                for(int i =0; i<outList.size(); i++){
                    PrintWriter o = outList.get(i);
                    o.println(line);
                    o.flush();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try{
                outList.remove(out);
            }
            catch(Exception ex){
                ex.printStackTrace();
            }
        }
        for(int i = 0; i<outList.size(); i++){
            PrintWriter o =outList.get(i);
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