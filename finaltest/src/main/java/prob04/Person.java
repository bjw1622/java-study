package prob04;

public class Person {
	private static int numberOfPerson; // 전체 인구수
	private int age;
	private String name;

	public Person() {
		this.age = 12;
		this.name = "";
		numberOfPerson++;
	}
	
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
		numberOfPerson++;
	}
	
	public Person(String name) {
		this.name = name;
		this.age = 12;
		numberOfPerson++;
	}
	
	public void selfIntroduce() {
		System.out.println("내 이름은 " + this.name + "이며, 나이는 " + this.age+"살 입니다.");
	}
	
	public static int getPopulation() {
		return numberOfPerson;
	}
	
}
