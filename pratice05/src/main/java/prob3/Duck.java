package prob3;

public class Duck extends Bird {

	@Override
	protected void fly() {
		System.out.println("오리("+super.getName()+")는 날지 않습니다.");
	}

	@Override
	protected void sing() {
		// TODO Auto-generated method stub
		System.out.println("오리("+super.getName()+")가 소리내어 웁니다.");

	}

	@Override
	public String toString() {
		return "오리의 이름은 "+super.getName()+" 입니다.";
	}
	

}
