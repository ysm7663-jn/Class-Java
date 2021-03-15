package ex03;

import java.sql.Connection;
import java.sql.PreparedStatement;

import connection.DBConnect;
import vo.JobVO;

public class Ex02_DeleteTest {

	public static void main(String[] args) {

		// 차장을 삭제하시오.
		// DELETE FROM JOB WHERE JOB_TITLE = '차장';

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = null;
		int result = 0;

		JobVO jobVO = new JobVO();
		
		// String job_id = "CJ"  : JobVO 사용 안 할 시
		
		jobVO.setJob_id("CJ");

		try {

			// 1. 연결
			conn = DBConnect.getConnection();

			// 2. 쿼리문 미리 작성
			sql = "DELETE FROM JOB WHERE JOB_ID = ?";

			// 3. 쿼리문 담당 ps
			ps = conn.prepareStatement(sql);

			// 4. 쿼리문 변수 처리
			ps.setString(1, jobVO.getJob_id());
			// 
			result = ps.executeUpdate();
			
			if (result > 0)
				System.out.println(jobVO.getJob_id() + "이(가) 수정되었습니다.");
			else
				System.out.println(jobVO.getJob_id() + "이(가) 수정되지 않았습니다.");

			// result (삭제된 데이터의 개수가 반환된다.)
			// 1) 0 : 삭제된 ROW가 0개인다.
			// 2) 1 : 삭제된 ROW가 1개인다.

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
