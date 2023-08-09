package chapter03;

public class StaticMethod {
	int n;
	static int m;

	void f1() {
		n = 10;
	}

	void f2() {
		// 같은 클래스의 클래스(static) 변수 접근에서는 클래스 이름 생략 가능
		m = 20;
	}

	void f3() {
		f2();
	}

	void f4() {
		s1();
	}

	static void s1() {
//	static 메서드에서는 인스턴스 변수 접근 불가
//	n = 10;
	}
	
	static void s2() {
//		f1();
	}
	static void s3() {
		m = 20;
		s1();
		m = 30;
	}
	static void s4() {
		s1();
	}
}
