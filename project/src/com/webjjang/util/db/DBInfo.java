package com.webjjang.util.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DBInfo {
	
	private static final String DRIVER = "oracle.jdbc.driver.OracleDriver";
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String UID = "fast1";
	private static final String UPW = "fast1";
	private static boolean isDriver = false;
	
	static {
		//1. 드라이버확인
		try {
			Class.forName(DRIVER);
			isDriver = true;
			System.out.println("드라이버 확인 완료");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("드라이버 로딩이 실패해서 종료");
			System.exit(1);
		}
	}
	
	public static Connection getConnection() throws Exception {
		if (!isDriver) throw new Exception("드라이버가 없어서 실행 불가");
		return DriverManager.getConnection(URL, UID, UPW);
		
	}
	
	public static void close(Connection con, PreparedStatement pstmt) throws Exception {
		if(con != null) con.close();
		if(pstmt != null) pstmt.close();
		
	}
	public static void close(Connection con, PreparedStatement pstmt, ResultSet rs) throws Exception {
		close(con, pstmt);
		if(rs != null) rs.close();
		
	}
}
