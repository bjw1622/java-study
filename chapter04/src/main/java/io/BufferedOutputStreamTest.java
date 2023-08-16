package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {

	public static void main(String[] args) throws IOException {
		BufferedOutputStream bos = null;
		try {
			// 기반 스트림
			FileOutputStream fis = new FileOutputStream(
					"/Users/jay/poscodx2023/eclipse-workspace/java-study/chapter04/hello.txt");

			// 보조 스트림
			bos = new BufferedOutputStream(fis);
			for (int i = 'a'; i < 'z'; i++) {
				bos.write(i);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found: " + e);
		} finally {
			try {
				if (bos != null) {
					bos.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
