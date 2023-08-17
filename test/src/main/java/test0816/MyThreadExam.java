package test0816;

public class MyThreadExam {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println(name);
        System.out.println("start!");
        // 1초마다 *를 10번 출력하는 프로그램을 작성하시오.
        for(int i =0; i <10; i++){
            System.out.print("*");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        // 1초마다 +를 10번 출력하는 프로그램을 작성하시오.
        for(int i =0; i <10; i++){
            System.out.print("+");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // 위 두가지 동작을 동시에 진행하는 방법은 없을까??
        // 여기서 등장하는 개념이 바로 Thread
        System.out.println("end!");
    }
}
