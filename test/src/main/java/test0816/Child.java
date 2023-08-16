package test0816;

public class Child extends Parent {

	public int c = 30; // public 필드

	void display() {

//		System.out.println(a); // 상속받은 private 필드 참조

		System.out.println(b); // 상속받은 public 필드 참조
		System.out.println(c);
		System.out.println(b);
	}
	@Override
	public String toString() {
		return "Parent [a="+ ", b=" + b + "]";
	}
}
