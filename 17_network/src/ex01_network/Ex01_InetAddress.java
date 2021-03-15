package ex01_network;

import java.net.InetAddress;
import java.util.Arrays;

public class Ex01_InetAddress {

	public static void main(String[] args) {
		
		// 원격 호스트
		String host = "www.naver.com";
		
		// InetAddress 타입의 객체 ipAddress 선언
		InetAddress ipAddress = null;
		
		try {
			
			ipAddress = InetAddress.getByName(host);
			System.out.println(ipAddress);
			System.out.println(ipAddress.getHostName());	// www.naver.com
			System.out.println(ipAddress.getHostAddress());	// 210,89,164,90	// IP주소 : 0 ~ 255
			// -128 ~ 127				128 == -128, 129 == -127, 130 == -126, 131 == -125 ... 시계와 비슷한 개념
			
			byte[] byteIp = ipAddress.getAddress();	// 4개 값 생성, 127 이상의 숫자는 -n 으로 계산됨, 음수들의 값은 + 256을 더하여 원래 값으로 만들 수 있다.
			System.out.println(Arrays.toString(byteIp));
			
			// byte[] -> String
			String realIp = "";
			
			for (int i = 0; i < byteIp.length; i++) {
				realIp += (byteIp[i] < 0 ? byteIp[i] + 256 : byteIp[i]);
				if (i != byteIp.length - 1) {
					realIp += ".";
				}
			}
			
			System.out.println(realIp);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
