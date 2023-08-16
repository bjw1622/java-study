package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		// 기반 스트림
		FileReader fr = new FileReader("./src/main/java/io/FileReaderTest.java");
		br = new BufferedReader(fr);

		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
	}

}
