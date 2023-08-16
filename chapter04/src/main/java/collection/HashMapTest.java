package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		m.put("one", 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);

		int i = m.get(new String("one")); // auto unboxing
		int j = m.get("one");
		System.out.println(i + " : " + j);

		m.put("three", 3333);
		System.out.println(m.get("three"));

		Set<String> s = m.keySet();
		for (String k : s) {
			System.out.println(k);
		}
	}

}
