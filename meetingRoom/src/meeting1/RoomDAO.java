package meeting1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RoomDAO {
	String dbDrv = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/bbangme1";
	String dbUsr = "bbangme1";
	String dbPwd = "123456";
			
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
			if (rs != null) { rs.close();}
			if (pstmt != null) { pstmt.close();}
			if (conn != null) { conn.close();}
			} catch(Exception e) {
				e.printStackTrace();
			}
	}

	public List<RoomDTO> getSelectAll() {
		List<RoomDTO> list = new ArrayList<>();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//---------------------------------------------------
			String sql = "select * from room order by id desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				RoomDTO dto = new RoomDTO();
				dto.setId(rs.getInt("id"));
				dto.setRoomName(rs.getString("room_name"));
				dto.setCapacity(rs.getInt("capacity"));
				list.add(dto);
			}
			//---------------------------------------------------
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패 또는 접속 실패"+e.getMessage());
		} finally {
			dbClose(rs, pstmt, conn);
		}
		
		return list;
	}
	
	
	public int setInsert(RoomDTO dto) {
		
		int result = 0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbUrl,dbUsr,dbPwd);
			//---------------------------------------------------
			String sql = "";
			sql += "insert into room (id, room_name, capacity)values";
			sql += "(null, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getRoomName());// 숫자는 물음표 순서를 나타냄
			pstmt.setInt(2, dto.getCapacity());
			result = pstmt.executeUpdate();
			//---------------------------------------------------
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("드라이버 로딩 실패 또는 접속 실패"+e.getMessage());
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
	
