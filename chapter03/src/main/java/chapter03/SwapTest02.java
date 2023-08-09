package chapter03;

public class SwapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;

		System.out.println("a=" + a + ",b=" + b);

//		int target = 0;
//		target = a;
//		a = b;
//		b = target;

		swap(a, b);
		System.out.println("a=" + a + ",b=" + b);
	}

	private static void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
	}
}
