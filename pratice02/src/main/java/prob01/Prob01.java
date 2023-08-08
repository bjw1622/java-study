package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };
		int total = scanner.nextInt();
		System.out.println("금액:"+total);
		
		System.out.println("50000원 : "+total/50000 +"개");
		System.out.println("10000원 : "+(total%50000)/10000 +"개");
		System.out.println("5000원 : "+(total%50000)%10000/5000 +"개");
		System.out.println("1000원 : "+(total%50000)%10000%5000/1000 +"개");
		System.out.println("500원 : "+(total%50000)%10000%5000%1000/500 +"개");
		System.out.println("100원 : "+(total%50000)%10000%5000%1000%500/100 +"개");
		System.out.println("50원 : "+(total%50000)%10000%5000%1000%500%100/50 +"개");
		System.out.println("10원 : "+(total%50000)%10000%5000%1000%500%100%50/10 +"개");
		System.out.println("5원 : "+(total%50000)%10000%5000%1000%500%100%50%10/5 +"개");
		System.out.println("1원 : "+(total%50000)%10000%5000%1000%500%100%50%10%5/1 +"개");
		scanner.close();
 	}
}