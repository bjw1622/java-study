package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		Set<String> s = new HashSet<>();
		s.add("둘리");
		s.add("마이콜");
		s.add("또치");
		// 중복 값 안들어감
		// 자료구조는 무조건 동질성!!
		// 동일성과 동질성
		// 동일성은 객체의 메모리 주소가 같은지를 비교하는 개념 (==)
		// 동질성은 객체의 내용이 같은지를 비교하는 개념 (equals)
		String s1 = new String("또치");
		String s2 = "또치";
		s.add(s1);

		System.out.println(s.size());
		// 순회
		for (String str : s) {
			System.out.println(str);
		}
	}

}
