package connection;

import java.sql.Connection;
import java.sql.DriverManager;

// 모든 DB의 첫 단계는 접속이다.
public class DBConnect {

	// field (접속정보)
	private static String user = "HR";
	private static String password = "1111";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
	// @127.0.0.1 : oracle db 가 설치된 캐시(local host, 회사 IP), 1521 : port 번호 , xe = 경량버전(Express)
	private static String jdbcDriver = "oracle.jdbc.driver.OracleDriver"; // 접속을 담당하는 Oracle 클래스 * Oracle 제작
	// orclae.jdbc.driver = package / OracleDriver = class
	// jdbc가 잘못 등록됐을 경우 "이부분"이 오류남

	// method (Connection 객체 생성 및 반환 처리)
	public static Connection getConnection() throws Exception {

		// 1. jdbcDriver를 사용할 수 있도록 메모리에 로드한다.
		Class.forName(jdbcDriver);

		// 2. DriverManager 클래스가 접속 정보를 이용해서 접속(Connection)을 생성한다.
		Connection conn = DriverManager.getConnection(url, user, password);

		// 3. 접속 객체 conn을 반환한다.
		return conn;

		// return DriverManager.getConnection(url, user, password);
		
		// Class, DriverManager 클래스는 예외처리를 필수로 해야 한다.
		// getConnection() 메소드에서 처리하지 말고,
		// getConnection() 메소드를 호출하는 영역으로 예외를 던지겠다.

		// 메소드가 예외 던지는 방법
		// public 결과타입 메소드명 () thows Exception { }

	}

}
