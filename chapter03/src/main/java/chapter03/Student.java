package chapter03;

public class Student extends Person {
	public Student() {
//		자식 생성자에서 부모 생성자 명시를 안하면 
//		자동으로 부모의 기본 생성자를 자식 생성자 코드 맨 앞에 호출한다 
		super();
		System.out.println("Student() called");
	}
}