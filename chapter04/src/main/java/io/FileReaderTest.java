package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		Reader in = null;
		try {
			in = new FileReader("//Users/jay/poscodx2023/eclipse-workspace/java-study/chapter04/src/main/java/io/test");
			int data = -1;
			int count = 0;
			while ((data = in.read()) != -1) {
				System.out.print((char) data);
				count++;
			}
			System.out.println("");
			System.out.println("count : " + count);
			System.out.println("=================");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found : " + e);
		} catch (IOException e) {
			System.out.println("error : " + e);
		} finally {
			try {
				if (in != null) {
					in.close();
				}
			} catch (IOException e) {

			}
		}
	}
}