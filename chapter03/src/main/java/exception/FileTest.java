package exception;

import java.io.FileInputStream;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
//		FileInputStream fis = null;
//		try {
//			fis = new FileInputStream("hello.txt");
//			int data = fis.read();
//
//			System.out.println((char) data);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//			System.out.println("error : " + e);
//		} catch (IOException e) {
//			System.out.println("error : " + e);
//		} finally {
//			try {
//				if (fis != null) {
//					fis.close();
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		FileInputStream fis = new FileInputStream("hello.txt");
		int data = fis.read();
		System.out.println((char) data);
		fis.close();

	}

}
