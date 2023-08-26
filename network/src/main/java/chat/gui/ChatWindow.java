package chat.gui;


import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class ChatWindow {

    private Frame frame;
    private final Panel panel;
    private Button buttonSend;
    private TextField textField;
    private TextArea textArea;
    private String message;
    private String name;
    private Socket socket;
    private PrintWriter pw;
    private BufferedReader br;

    public ChatWindow(String name, Socket socket) {
        frame = new Frame(name);
        panel = new Panel();
        buttonSend = new Button("Send");
        textField = new TextField();
        textArea = new TextArea(30, 80);
        this.name = name;
        this.socket = socket;
    }

    public void show() {
        buttonSend.setBackground(Color.GRAY);
        buttonSend.setForeground(Color.WHITE);
        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sendMessage();
            }
        });

        textField.setColumns(80);
        textField.addKeyListener(new KeyAdapter() {

            @Override
            public void keyPressed(KeyEvent e) {
                char keyCode = e.getKeyChar();
                if (keyCode == KeyEvent.VK_ENTER) {
                    sendMessage();
                }
            }
        });

        panel.setBackground(Color.LIGHT_GRAY);
        panel.add(textField);
        panel.add(buttonSend);
        frame.add(BorderLayout.SOUTH, panel);

        textArea.setEditable(false);
        frame.add(BorderLayout.CENTER, textArea);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                finish();
            }
        });

        frame.setVisible(true);
        frame.pack();


        updateTextArea("채팅창에 입장했습니다.");

        try {
            pw = new PrintWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"), true);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
            new ChatClientThread(socket).start();

        } catch (IOException e) {
            log("error:" + e);
        }
    }

    private void sendMessage() {
        message = textField.getText();

        if ((message.trim()).isEmpty() == false) {

            if (message.equals("quit")) {
                finish();
            }
            pw.println("message:" + message);
            textField.setText("");
            textField.requestFocus();

            System.out.println(ChatClientApp.nickname + "이 보내는 메세지 : " + message);
        } else {
            updateTextArea("메세지는 한글자 이상 입력하셔야 합니다.");
        }
    }

    private void finish() {
        try {

            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
            System.exit(0);
        } catch (IOException e) {
            log("error:" + e);
        }
    }

    private void updateTextArea(String message) {
        textArea.append(message);
        textArea.append("\n");
    }

    private class ChatClientThread extends Thread {

        private Socket socket;

        public ChatClientThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String data = br.readLine();
                    updateTextArea(data);
                }
            } catch (IOException e) {
                log("error:" + e);
            }
        }
    }

    private static void log(String msg) {
        System.out.println("[클라이언트] " + msg);
    }
}