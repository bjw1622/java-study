package prob3;

import java.util.Scanner;

public class Prob3 {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		/* 코드 작성 */
		System.out.print("숫자를 입력하세요 : ");
		int target = scanner.nextInt();
		int total = 0;
//		 짝수
		if(target % 2 == 0) {
			for(int i = 0; i <= target; i++) {
				if(i % 2 == 0) {
					total += i;
				}
			}
//		홀수
		}
		else {
			for(int i = 0; i <= target; i++) {
				if(i % 2 != 0) {
					total += i;
				}
			}
		}
		System.out.println("결과 값 : "+ total);
		scanner.close();
	}
}
