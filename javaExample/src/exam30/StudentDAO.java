package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {

	String dbDrv = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
	String dbUsr = "javaUser";
	String dbPwd = "1234";

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

	public List<StudentDTO> getSelectAll() {
		List<StudentDTO> list = new ArrayList<>();

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "select * from student order by hakbun desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // 0 , 1
			while (rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setHakbun(rs.getInt("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setSsn(rs.getString("ssn"));
				dto.setPhone(rs.getNString("phone"));
				dto.setAddress(rs.getString("address"));
				dto.setCreatedDate(rs.getDate("createdDate"));
				list.add(dto);
			}
			// ------------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			dbClose(rs, pstmt, conn);
		}
		return list;
	}

	public int setInsert(StudentDTO dto) {

		int result = 0;

		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "";
			sql += "insert into student (hakbun, name, ssn, phone, address, createdDate)";
			sql += "values (null, ?, ?, ?, ?, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSsn());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getAddress());
			result = pstmt.executeUpdate(); // 0 , 1

			// ------------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			dbClose(rs, pstmt, conn);
		}

		return result;
	}

	public StudentDTO getSelectOne(StudentDTO paramdto) {
		StudentDTO dto = new StudentDTO();
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "select * from student where hakbun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, paramdto.getHakbun());
			rs = pstmt.executeQuery();
			if (rs.next()) {
				dto.setHakbun(rs.getInt("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setSsn(rs.getString("ssn"));
				dto.setPhone(rs.getNString("phone"));
				dto.setAddress(rs.getString("address"));
				dto.setCreatedDate(rs.getDate("createdDate"));
			}
			// ------------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			dbClose(rs, pstmt, conn);
		}
		return dto;
	}

	public int setDelete(StudentDTO dto) {
		int result = 0;
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "delete from student where hakbun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getHakbun());
			result = pstmt.executeUpdate(); // 0 , 1
			// ------------------------------------------------
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패");
		} finally {
			dbClose(rs, pstmt, conn);
		}
		return result;
	}

	public int setChange(StudentDTO dto) {
		int result = 0;
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			// ------------------------------------------------
			String sql = "update student set phone = ?,address = ? where hakbun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPhone());
			pstmt.setString(2, dto.getAddress());
			pstmt.setInt(3, dto.getHakbun());
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
