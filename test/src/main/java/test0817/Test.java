package test0817;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
//        // 동일한 문자열 리터럴은 하나의 인스턴스만 유지하게 된다.
//        String a = "123";
//        String b = "123";
//        System.out.println(a == b);
//        String c = a + "1";
//        String d = "1231";
//        System.out.println(c.equals(d));
//        System.out.println(c == d);
//        /*
//         *   문자열 리터럴로 생성하면, 기존에 같은 문자열이 존재하면 같은 값을 가르키게 된다
//         *   new String으로 객체 생성을 하면 무조건 heap 새로 할당이 된다!!
//         * */
//        double[] a = {1.2,3.4,5.6};
//        double[] b = a;
//        b[0] = 7.8;
//        System.out.println(Arrays.toString(a));
//        System.out.println(Arrays.toString(b));
//        String a = "a";
//        String b = new String("a");
//        String c = "a";
//        String d = new String("a");
//        String e = "a";
//        String f = new String("a");
//
//        System.out.println(a == b);
//        System.out.println(a == c);
//        System.out.println(a == d);
//        System.out.println(a == e);
//        System.out.println(a == f);
//
//        System.out.println();
//
//        System.out.println(b == c);
//        System.out.println(c == d);
//        System.out.println(d == e);
//        System.out.println(e == f);

        String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다.";
        String name;
        int age;

        name = str.substring(7,10);
        int a = str.lastIndexOf("[");
        int b = str.lastIndexOf("]");
        System.out.println(a);
        System.out.println(b);
        char first = (char)(str.charAt(a+1));
        int second = str.charAt(b-1);
//        System.out.println((Character.to);
        System.out.println(second);
        age = first+ second;
        System.out.println(name);
        System.out.println(age);


    }
}
