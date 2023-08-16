package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest01 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<>();
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("도우너");

		for (int i = 0; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(i);
		}

		// 삭제
		v.removeAll(v);

		for (int i = 0; i < v.size(); i++) {
			String s = v.elementAt(i);
			System.out.println(i);
		}

		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
	}

}
