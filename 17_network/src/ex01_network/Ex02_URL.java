package ex01_network;

import java.net.URL;

public class Ex02_URL {

	public static void main(String[] args) {

		String host = "http://www.naver.com/abc.txt";

		URL url = null;

		try {

			url = new URL(host);
			System.out.println(url.getDefaultPort());	// http 번호
			System.out.println(url.getPath());			// 경로 뒤에 표시
			System.out.println(url.getFile());			// 경로 뒤에 표시
			System.out.println(url.getProtocol());		// http
			System.out.println(url.getHost());			// host

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
