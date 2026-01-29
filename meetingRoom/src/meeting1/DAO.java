package meeting1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DAO {
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

	public List<DTO> getSelectAll() {
		List<DTO> list = new ArrayList<>();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ---------------------------------------------------
			String sql = "select * from reserver order by id desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				DTO dto = new DTO();
				dto.setId(rs.getInt("id"));
				dto.setReserver_name(rs.getString("reserver_name"));
				dto.setReserver_num(rs.getString("reserver_num"));
				dto.setReserve_time(rs.getString("reserve_time"));
				dto.setDate(rs.getDate("date"));
				dto.setRoom_id(rs.getInt("room_id"));
				list.add(dto);
			}
			// ---------------------------------------------------
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패 또는 접속 실패" + e.getMessage());
		} finally {
			dbClose(rs, pstmt, conn);
		}

		return list;
	}

	public int setInsert(DTO dto) {

		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ---------------------------------------------------
			String sql = "";
			sql += "insert into reserver (id, reserver_name, reserver_num, reserver_time, createdDate, room_id)values";
			sql += "(null, ?, ?, ?,?, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getReserver_name());// 숫자는 물음표 순서를 나타냄
			pstmt.setString(2, dto.getReserver_num());
			pstmt.setString(3, dto.getReserve_time());
			result = pstmt.executeUpdate();
			pstmt.setInt(4, dto.getRoom_id());
			// ---------------------------------------------------
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패 또는 접속 실패" + e.getMessage());
		} finally {
			dbClose(rs, pstmt, conn);
		}
		return result;
	}

	public int setDelete(DTO dto) {
		int result = 0;

		return result;
	}
}
