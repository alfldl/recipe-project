package dao.board;

import java.sql.Connection;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class ReplyDao {
	
	private ReplyDao() {}
	
	private static ReplyDao instance;
	
	public static ReplyDao getInstance() {
		if (instance == null) {
			instance = new ReplyDao();
		}
		return  instance;
	}
	
	private Connection getConnection() {
		Connection conn = null;
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
}	
