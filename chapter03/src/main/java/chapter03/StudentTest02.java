package chapter03;

public class StudentTest02 {
	public static void main(String[] args) {
		Student s1 = new Student();
		
		// 업 캐스팅  upcasting(암시적)
		Person p = s1;
		Student s2 = (Student)p; // downcasting(명시적)
	}
}
