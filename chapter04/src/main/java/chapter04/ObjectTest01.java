package chapter04;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point point = new Point();

//		Class kclass = point.getClass(); // reflection
		System.out.println(point.getClass());

		System.out.println(point.hashCode()); // address X, reference X, address 기반의 해싱값이다

		System.out.println(point.toString()); // getClass() + "@" + hasCode()

		System.out.println(point); // 객체가 들어오면 toString을 호출하는구나~~
		
		/*
		 * 
		 *    ==   동일성 비교 (값)
		 *  equals 동질성 비교 (안의 내용)
		 * 
		 * */
	}
}
