package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
	public static void main(String[] args) {
		// 1byte 처리 스트림 = 8bit
		InputStream is = System.in;

		// 2byte 처리 스트림
		//InputStreamReader isr = new InputStreamReader(is);

		// 문자열 1줄씩 입력받을 수 있는 객체
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자열 입력: ");
		try {
			String line = br.readLine();
			System.out.println("line: " + line);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
