package dao;

import java.sql.*;

import javax.naming.*;
import javax.sql.DataSource;





public class BoardDao {
	
	private BoardDao() {}
	
	private static BoardDao instance;
	public static BoardDao getInstance() {
		if (instance == null) {
			instance = new BoardDao();
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
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
//	public int getTotalCnt() throws SQLException {
//		
//	}
	
}










