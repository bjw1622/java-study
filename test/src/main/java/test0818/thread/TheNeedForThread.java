package test0818.thread;

public class TheNeedForThread {
    public static void main(String[] args) {
        int[] intArray = new int[]{1, 2, 3, 4, 5};
        String[] strArray = new String[]{"하나", "둘", "셋", "넷", "다섯"};

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("(비디오 프레임)" + intArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {

            }
        }
        for (int i = 0; i < strArray.length; i++) {
            System.out.println("(자막)" + strArray[i]);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
            }
        }
    }
}
