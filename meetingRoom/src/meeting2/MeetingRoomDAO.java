package meeting2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MeetingRoomDAO {

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

	public void RoomList() {
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			String sql = "SELECT id, room_name, capacity FROM room";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			System.out.println("\n[ 회의실 목록 ]");
			while (rs.next()) {
				System.out.printf("번호: %d | 이름: %s | 수용인원: %d명\n", rs.getInt("id"), rs.getString("room_name"),
						rs.getInt("capacity"));
			}
		} catch (Exception e) {
			System.out.println("회의실 목록 불러오기 실패");
		} finally {
			dbClose(rs, pstmt, conn);
		}
	}

	public int setInsert(MeetingRoomDTO dto) {

		int result = 0;

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "";
			sql += "insert into reserver (id, reserver_name, reserver_num, reserve_time, date, room_id) ";
			sql += "values (null, ?, ?, ?, ?, ?)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getReserverName());
			pstmt.setString(2, dto.getreserverNum());
			pstmt.setString(3, dto.getReserveTime());
			pstmt.setDate(4, dto.getDate());
			pstmt.setInt(5, dto.getRoomId());
			result = pstmt.executeUpdate(); // 0 , 1

			// ------------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			dbClose(rs, pstmt, conn);
		}

		return result;
	}

	public boolean TimeOverlap(MeetingRoomDTO dto) {

		boolean overlap = false;

		String[] newTime = dto.getReserveTime().split("-");
		String newStart = newTime[0];
		String newEnd = newTime[1];

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);

			String sql = "";
			sql += "select reserve_time from reserver where date = ? and room_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setDate(1, dto.getDate());
			pstmt.setInt(2, dto.getRoomId());
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String dbTime = rs.getString("reserve_time");
				String[] dbSplit = dbTime.split("-");

				String dbStart = dbSplit[0];
				String dbEnd = dbSplit[1];

				// 시간 겹침 판정
				if (dbStart.compareTo(newEnd) < 0 && dbEnd.compareTo(newStart) > 0) {
					overlap = true;
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			dbClose(rs, pstmt, conn);
		}

		return overlap;
	}
	
	public int RoomExceeded(int roomId) {
	    int capacity = 0;
	    try {
	    	Class.forName(dbDrv);
	        conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
	        String sql = "selct capacity from room where id = ?";
	        pstmt = conn.prepareStatement(sql);
	        pstmt.setInt(1, roomId);
	        rs = pstmt.executeQuery();

	        if (rs.next()) {
	            capacity = rs.getInt("capacity");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } finally {
	        dbClose(rs, pstmt, conn);
	    }
	    return capacity;
	}
}
