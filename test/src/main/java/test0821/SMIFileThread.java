package test0821;

public class SMIFileThread extends Thread {
    @Override
    public void run() {
        String[] strArray = new String[]{"하나", "둘", "셋", "넷", "다섯"};

        for (int i = 0; i < strArray.length; i++) {
            System.out.println("(자막)" + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}
