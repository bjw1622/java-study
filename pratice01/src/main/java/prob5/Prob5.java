package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			String s = Integer.toString(i);
			String answer = "";
			if(s.charAt(0)=='3' || s.charAt(0)=='6'|| s.charAt(0)=='9') {
				answer += "짝";
			}
			if(answer.length() == 1 && answer.charAt(0) == '짝') {
				System.out.println(s +" " + answer);
			}
		}
		
		for(int i=10; i<100; i++) {
			String s = Integer.toString(i);
			String answer = "";
			if(s.charAt(0)=='3' || s.charAt(0)=='6'|| s.charAt(0)=='9') {
				answer += "짝";
			}
	        if(s.charAt(1)=='3' || s.charAt(1)=='6'|| s.charAt(1)=='9') {
					answer += "짝";
	        };
			if(answer.length() >= 1 && answer.charAt(0) == '짝') {
				System.out.println(s +" " + answer);
			}
		}
	}
}
