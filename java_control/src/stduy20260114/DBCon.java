package stduy20260114;

import java.sql.*;

public class DBCon {

	private Connection conn;
	private Statement st;
	private ResultSet rs;

	public DBCon() {
		login();
	}

	private void login() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String id = "bbangme1";
			String pw = "123456";
			String url = "jdbc:mysql://localhost:3306/bbangme1";

			conn = DriverManager.getConnection(url, id, pw);

		} catch (Exception e) {
			System.out.println("접속 실패");
			e.printStackTrace();
		}

	}

	public Item[] findItems() {

		Item[] items = new Item[10];

		String sql = "select * from item";

		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);

			int i = 0;
			while (rs.next()) {
				Item date = new Item(rs.getString("item_name"), rs.getInt("item_price"),
						rs.getString("item_main_image"), rs.getInt("item_stock"));

				items[i] = date;
				i++;
			}
		} catch (Exception e) {
			System.out.println("객체 생성 실패");
			e.printStackTrace();
		}

		return items;

	}
}
