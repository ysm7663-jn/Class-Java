package ex04;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.DBConnect;

public class Ex03_selectOneTest {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement ps = null;
		String sql = null;
		ResultSet rs = null;
		int count = 0;

		try {

			conn = DBConnect.getConnection();

			sql = "SELECT COUNT(*) FROM JOB"; // 23

			ps = conn.prepareStatement(sql);

			rs = ps.executeQuery();
			rs.next();

			count = rs.getInt(1);
			//count = rs.getInt("ROW_COUNT");
			System.out.println("전체 ROW : " + count);

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
