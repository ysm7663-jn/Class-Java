package ex02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnect;
import vo.JobVO;

public class Ex03_InsertTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = null;
		int result = 0;

		// JOBVO 객체 생성
		// 역할 : JOB 테이블에 보낼 때 사용
		// DB와의 통신용

		JobVO jobVO = new JobVO();
		jobVO.setJob_id("SW");
		jobVO.setJob_title("사원");
		jobVO.setMin_salary(3000);
		jobVO.setMax_salary(4500);

		try {

			// 1. 접속
			conn = DBConnect.getConnection();

			// 2. 쿼리문 미리 준비
			sql = "INSERT INTO JOB VALUES (?, ?, ?, ?)";

			// 3. 쿼리 담당 ps
			ps = conn.prepareStatement(sql);

			// 4. 쿼리문에 변수 처리
			ps.setString(1, jobVO.getJob_id());
			ps.setString(2, jobVO.getJob_title());
			ps.setInt(3, jobVO.getMin_salary());
			ps.setInt(4, jobVO.getMax_salary());

			// 5. 쿼리문 실행
			result = ps.executeUpdate();

			if (result > 0)
				System.out.println(jobVO.getJob_id() + "이(가) 추가되었습니다.");
			else
				System.out.println(jobVO.getJob_id() + "이(가) 추가되었습니다.");
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
