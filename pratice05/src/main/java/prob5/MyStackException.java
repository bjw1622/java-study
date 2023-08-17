package prob5;

public class MyStackException extends Exception {

	private static final long serialVersionUID = 1L;

//	public MyStackException() {
//		super("stack is empty");
//	}

//	public MyStackException(String errMSG) {
//		super(errMSG);
//	}
	@Override
	public String toString() {
		return "Prob5.MyStackException:: stack is empty";
	}
}
