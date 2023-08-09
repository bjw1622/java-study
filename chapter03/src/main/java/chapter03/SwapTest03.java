package chapter03;

import mypackage.Value;

public class SwapTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Value a = new Value(10);
		Value b = new Value(20);

		System.out.println("a=" + a.val + ",b=" + b.val);

//		int target = 0;
//		target = a;
//		a = b;
//		b = target;

		swap(a, b);
		System.out.println("a=" + a.val + ",b=" + b.val);
	}

	private static void swap(Value m, Value n) {
		int temp = m.val;
		m.val = n.val;
		n.val = temp;
	}
}
