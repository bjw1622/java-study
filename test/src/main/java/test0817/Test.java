package test0817;

public class Test {
    public static void main(String[] args) {
        // 동일한 문자열 리터럴은 하나의 인스턴스만 유지하게 된다.
        String a = "123";
        String b = "123";
        System.out.println(a == b);
        String c = a + "1";
        String d = "1231";
        System.out.println(c.equals(d));
        System.out.println(c == d);
        /*
         *   문자열 리터럴로 생성하면, 기존에 같은 문자열이 존재하면 같은 값을 가르키게 된다
         *   new String으로 객체 생성을 하면 무조건 heap 새로 할당이 된다!!
         * */
    }
}
