package exception;

public class ExceptionTest {
	public static void main(String[] args) {

		int a = 10;
		int b = 10 - a;

		System.out.println("some code 1");

		try {
			System.out.println("some code 2");
			int result = (1 + 2 + 3) / b;
			System.out.println("some code 3");
		}

		catch (Exception e) {
			/*
			 * 예외 처리
			 * 1. 화면 출력 로깅
			 * 
			 * 2. 사과
			 * 3. 정상 종료
			 * */
			System.out.println("예외 발생" + e);
			System.out.println("some code 4");
			// 프로그램 자동 종
			System.exit(1);
		}

		finally {
			System.out.println("some code 5");
		}
	}
}
