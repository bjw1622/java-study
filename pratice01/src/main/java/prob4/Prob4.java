package prob4;

import java.util.Scanner;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		int textLength = text.length();
		String answer = "";
		for(int i =0; i<textLength; i++) {
			answer += text.charAt(i);
			System.out.println(answer);
		}
		scanner.close();
	}

}