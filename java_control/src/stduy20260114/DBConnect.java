package stduy20260114;

import java.sql.*; // sql 전부 접근

public class DBConnect {
	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public DBConnect() {
		connect(); // 데이터베이스 연결을 위한 메서드

	}

	private void connect() {
		// 데이터베이스 드라이버 실행 - 연결
		// 계정 로그인
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "bbangme1";
			String passwold = "123456";
			String url = "jdbc:mysql://localhost:3306/bbangme1";

			conn = DriverManager.getConnection(url, username, passwold);

		} catch (Exception e) {
			System.out.println("접속 실패");
		}
	}

	public GameMember[] findAll() {

		GameMember[] gameMembers = new GameMember[10];

		String sql = "select * from game_member";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			int i = 0;
			while (rs.next()) {
				GameMember data = new GameMember(rs.getString("name"),
						rs.getString("birth"), rs.getString("nick_name"),
						rs.getInt("level"));
				
				gameMembers[i] = data;
				i++;
			}
		} catch (Exception e) {
			System.out.println("정의 실패 및 객체생성 실패");
		}

		return gameMembers;

	}

}
