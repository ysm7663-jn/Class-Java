package ex01_basic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Testy {
	
	public static void main(String[] args) throws IOException {
		// 입출력 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		
		String name = br.readLine();
		StringTokenizer st = new StringTokenizer(name, " ");
		
		String first = st.nextToken();
		String second = st.nextToken();
		
		bw.append(first);
		bw.newLine();
		
		bw.flush();
		bw.close();
		
		
	}
}