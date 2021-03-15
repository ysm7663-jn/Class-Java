package ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnect;

public class Ex01_InsertTest {

	public static void main(String[] args) {

		Connection conn = null; // 접속 담당
		PreparedStatement ps = null; // 쿼리 담당
		// 사용 종료 후 시스템 종료(close)로 메모리 반납
		String sql = null; // 쿼리문 작성
		int result = 0; // 쿼리문 실행 결과 (INSERT, UPDATE, DELETE문은 int 타입의 결과를 반환한다.)

		try {
			// 1. 접속을 한다.
			conn = DBConnect.getConnection();
			
			// 2. 쿼리문을 미리 준비한다. (PreparedStatement을 사용하므로)
			sql = "INSERT INTO JOB (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) " + 
				  "VALUES ('DR', '대리', 3500, 5000)";	// 쿼리문 안에서 세미콜론(;) 붙여서 넘기면 오류난다.
			
			// 3. 준비된 쿼리문을 이용해서 쿼리 담당 ps를 생성한다.
			ps = conn.prepareStatement(sql);
			
			// 4. 쿼리 담당 ps가 쿼리를 실행한다.
			// 실행 메소드
			// 1) excuteUpdate() : INSERT, UPDATE, DELETE 실행
			// 2) excuteQuery()  : SELECT 실행
			
			// 쿼리 실행 결과는 쿼리문(sql)에 따라 다르다.
			result = ps.executeUpdate();
			
			if (result > 0) 
				System.out.println("JOB이 추가되었습니다.");
			else 
				System.out.println("JOB이 추가되지 않았습니다.");
			
			// 실행결과
			// 0 : INSERT 된 데이터가 0개이다. (실패)
			// 1 : INSERT 된 데이터가 1개이다. (성공)
			
			// 기본적으로 setAutoCommit(true) 상태이기 때문에 
			// COMMIT이 필요하지 않다.

			// 자동 커밋을 끄고 수동으로 커밋을 할 수 있다. (실제로는 사용하지 않음)
			/* conn.DBConnect.getConnection();
			 * conn.setAutoCommit(false);
			 * 
			 * result = ps.executeUpdate();
			if (result > 0) 
				conn.commit();	// 수동 커밋
			*/	
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
				
				if (conn != null)
					conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
