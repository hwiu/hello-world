package com.hxt.jdbctest;

import java.sql.DriverManager;
import java.sql.SQLException;
public class DBConn {
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/world";
	private static final String NAME = "com.mysql.jdbc.Driver";
	private static final String USER ="root";
	private static final String PASSWORD = "hxt369";
	
	public java.sql.Connection conn = null;
	public java.sql.PreparedStatement pst = null;
	
	public DBConn(String sql){
		try {
			Class.forName(NAME);
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
			pst = conn.prepareStatement(sql);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public void close(){
		try {
			this.conn.close();
			this.pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
