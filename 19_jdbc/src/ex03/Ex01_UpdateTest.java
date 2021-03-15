package ex03;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connection.DBConnect;
import vo.JobVO;

public class Ex01_UpdateTest {

	public static void main(String[] args) {

		// JOB_ID 가 DR인 데이터의 MIN_SALARY를 4000 으로 수정하고, MAX_SALARY를 5500으로 수정하시오.
		// UPDATE JOB SET MIN_SALARY = 4000, MAX_SALARY = 5500 WHERE JOB_ID = 'DR'

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = null;
		int result = 0;

		// JobVO 객체 생성
		// UPDATE 문의 실행에 필요한 정보만 담는다.
		// JOB_ID, MIN_SALARY, MAX_SALARY
		// JOB_TITLE은 사용하지 않음

		// 디폴트 타입으로 생성해서 필요한 정보만 setter로 저장한다.
		JobVO jobVO = new JobVO();
		jobVO.setJob_id("DR");
		jobVO.setMin_salary(4000);
		jobVO.setMax_salary(5500);

		try {

			// 1. 접속
			conn = DBConnect.getConnection();

			// 2. 쿼리문 미리 준비
			sql = "UPDATE JOB SET MIN_SALARY = ?, MAX_SALARY = ? WHERE JOB_ID = ?";

			// 3. 쿼리 담당 ps
			ps = conn.prepareStatement(sql);

			// 4. 쿼리문에 변수 처리
			ps.setInt(1, jobVO.getMin_salary());
			ps.setInt(2, jobVO.getMax_salary());
			ps.setString(3, jobVO.getJob_id());

			// 5. 쿼리문 실행
			result = ps.executeUpdate();

			if (result > 0)
				System.out.println(jobVO.getJob_id() + "이(가) 수정되었습니다.");
			else
				System.out.println(jobVO.getJob_id() + "이(가) 수정되지 않았습니다.");

			// result (수정된 데이터의 개수가 반환된다.)
			// 1) 0 : 수정된 ROW가 0개인다.
			// 2) 1 : 수정된 ROW가 1개인다.

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) { // ClassNotFoundException, SQLException 모두 처리 
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
