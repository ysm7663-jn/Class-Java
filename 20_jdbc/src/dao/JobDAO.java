package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnect;
import dto.JobDTO;

// DAO : DataBase Access Object
// DB에 접근하는 객체
// CRUD를 처리하는 객체
// CREATE : INSERT
// READ   : SELECT 
// UPDATE : UPDATE
// DELECT : DELECT

public class JobDAO {

	// field
	private Connection con; // 자동 null
	private PreparedStatement ps;
	private String sql;
	private int result;
	private ResultSet rs;
	// select 용

	// constructor
	public JobDAO() {
		// 접속만 해 두자.
		try {
			con = DBConnect.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// method
	// 접속 신경 쓸 필요 없음

	/* ***** 1. 삽입 메소드 ***** */
	public int insert(JobDTO dto) {

		try {
			sql = "INSERT INTO JOB VALUES (?, ?, ?, ?)";

			ps = con.prepareStatement(sql);

			ps.setString(1, dto.getJob_id());
			ps.setString(2, dto.getJob_title());
			ps.setInt(3, dto.getMin_salary());
			ps.setInt(4, dto.getMax_salary());

			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // try-catch-finally 끝나고 return

		return result;

	}

	/* ***** 2. 갱신 메소드 ***** */
	public int update(JobDTO dto) {
		try {
			// 대소문자 구분하기 때문에 upper 함수를 사용하여 대문자로 변경해준다.
			sql = "UPDATE JOB SET MIN_SALARY = ?, MAX_SALARY = ? WHERE JOB_ID = UPPEER(?)";

			ps = con.prepareStatement(sql);

			ps.setInt(1, dto.getMin_salary());
			ps.setInt(2, dto.getMax_salary());
			ps.setString(3, dto.getJob_id());

			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
		return result;
	}

	/* ***** 3. 삭제 메소드 ***** */
	public int delete(String job_id) {

		try {

			sql = "DELETE FROM JOB WHERE JOB_ID = ?";

			ps = con.prepareStatement(sql);

			ps.setString(1, job_id);

			result = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null)
					ps.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/* ***** 4. 검색 메소드 ***** */
	public JobDTO select(String job_id) {
		
		JobDTO dto = null;
		
		try {

			sql = "SELECT * FROM JOB WHERE JOB_ID = ?";

			ps = con.prepareStatement(sql);
			ps.setString(1, job_id);

			rs = ps.executeQuery();

			if (rs.next()) {	// rs가 없으면 next()하지 않고 null을 반환한다.
				dto = new JobDTO();	// rs 값이 없는 경우를 대비
				dto.setJob_id(rs.getString(1));
				dto.setJob_title(rs.getString(2));
				dto.setMin_salary(rs.getInt(3));
				dto.setMax_salary(rs.getInt(4));
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();

				if (ps != null)
					ps.close();

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
}
