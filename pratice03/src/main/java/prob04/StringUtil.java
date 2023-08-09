package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String answer = "";
		for(String temp : strArr) {
			answer += temp;
		}
		return answer;
	}
}
