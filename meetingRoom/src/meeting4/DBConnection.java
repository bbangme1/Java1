package meeting4;

import java.sql.Connection;
import java.sql.DriverManager;

// DB 연결 클래스

public class DBConnection {
	private static final String dbDrv = "com.mysql.cj.jdbc.Driver";
	private static final String url = "jdbc:mysql://localhost:3306/bbangme1";
	private static final String user = "bbangme1";
	private static final String password = "123456";

	public static Connection getConnection() throws Exception {
		return DriverManager.getConnection(url, user, password);
	}
}
