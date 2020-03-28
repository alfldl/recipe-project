package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.naming.*;
import javax.sql.DataSource;

import dto.Board;


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

	public int getTotalCnt() throws SQLException {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int totalCnt =0;
		String sql = "select count(*) from board";
		
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) totalCnt= rs.getInt(1);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			if (rs !=null) rs.close();
			if (stmt != null) stmt.close();
			if (conn !=null) conn.close();
		}
		return totalCnt;
	}

	public List<Board> list(int startRow, int endRow) throws SQLException {
		
		System.out.println("===============" + startRow + " " + endRow);
		List<Board> list = new ArrayList<Board>();
		Connection conn = null;	
		PreparedStatement pstmt= null;
		ResultSet rs = null;
		
		 String sql =
				 
				 "SELECT * FROM ( "
					 + "SELECT rownum rnum, a.* "
					 + "FROM "
					 + "( "
					 +	 "SELECT "
					 + 		"b.b_no, b.b_title, b.like_cnt, b.b_date, b.b_hits, m.m_name "
					 + 	 "FROM board b "
					 + 	 "LEFT JOIN member m "
					 +   "ON b.m_no = m.m_no "
					 +   "ORDER BY b_no DESC) a "
				 + ") "+
				 "WHERE rnum BETWEEN ? AND ?";
		 
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, startRow);
			pstmt.setInt(2, endRow);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				Board board = new Board();
				board.setRowNum(rs.getInt("rnum")); 
				board.setbNo(rs.getInt("b_no"));
				board.setWriter(rs.getString("m_name"));
				board.setTitle(rs.getString("b_title"));
				board.setbDate(rs.getDate("b_date"));
				board.setHits(rs.getInt("b_hits"));
				board.setLikeCnt(rs.getInt("like_cnt"));
				
				list.add(board);
			}	
		} catch(Exception e) {	
			e.printStackTrace(); 
		} finally {
			if (rs !=null) rs.close();
			if (pstmt != null) pstmt.close();
			if (conn !=null) conn.close();
		}
		return list;
	}
	

	
}










