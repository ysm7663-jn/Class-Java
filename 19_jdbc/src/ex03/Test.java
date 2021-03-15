package ex03;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnect;
import vo.JobVO;

public class Test {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = null;
		int result = 0;

		String job_id = "SW";
		int max_salary = 0;

		// JobVO 객체 생성
		JobVO jobVO = new JobVO();
		jobVO.setJob_id("SW");
		jobVO.setMax_salary(0);

		try {

			// 1. 접속
			conn = DBConnect.getConnection();

			// 2. 쿼리문 미리 작성
			sql = " ";

			// 3. 쿼리문 담당 ps
			ps = conn.prepareStatement(sql);

			// 4. 쿼리문 변수 처리
			// 1) 직접 삽입
			ps.setString(1, job_id);
			ps.setInt(2, max_salary);

			// 2) JobVO 객체 사용
			ps.setString(1, jobVO.getJob_id());
			ps.setInt(2, jobVO.getMax_salary());

			// 5. 쿼리 담당 ps 실행
			result = ps.executeUpdate();

			if (result > 0)
				System.out.println("성공");
			else
				System.out.println("실패");

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
