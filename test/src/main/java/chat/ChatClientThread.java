package chat;

import java.io.BufferedReader;
import java.io.IOException;

// 계속 읽어들이기
class ChatClientThread extends Thread {
    BufferedReader in = null;

    public ChatClientThread(BufferedReader in) {
        this.in = in;
    }

    public void run() {
        String line = null;
        try {
            if ((line = in.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }

}