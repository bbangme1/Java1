package meeting3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MeetingroomDAO {
	
	String dbDrv = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/bbangme1";
	String dbUsr = "bbangme1";
	String dbPwd = "123456";

	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int setDelete(MeetingroomDTO dto) {
		int result = 0;
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "delete from reserver where reserver_name = ? and date = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getReservername());
			pstmt.setDate(2,dto.getDate());
			result = pstmt.executeUpdate(); // 0 , 1
			// ------------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			dbClose(rs, pstmt, conn);
		}
		return result;
	}
	
	
}
 