package chapter03;

public class SwapTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		
		System.out.println("a="+a+",b="+b);
		
		int target = 0;
		target = a;
		a = b;
		b = target;
		
		System.out.println("a="+a+",b="+b);
	}

}
