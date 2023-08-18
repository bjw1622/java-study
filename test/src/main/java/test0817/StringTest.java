package test0817;

public class StringTest {
    public static void main(String[] args) {
        // 문자열 풀
        String a = "1";
        String b = a;
        a = "2";
        System.out.println(a);
        System.out.println(b);

        // new String()
        String c = new String("1");
        String d = c;
        c = "1";
        System.out.println();
    }
}
