package com.hxt.jdbctest;

import java.sql.ResultSet;
import java.sql.SQLException;


public class DBDemo {
	
	static String sql = null;
	static DBConn dbl = null;
	static ResultSet set = null;
	
	public static void main(String[] args) {
		sql = "select * from city limit 1000";
		dbl = new DBConn(sql);
		
		try {
			set = dbl.pst.executeQuery();
			while(set.next()){
				int  ID = set.getInt(1);
				String Name = set.getString(2);
				String CountryCode = set.getString(3);
				String distString = set.getString(4);
				int  populationStr = set.getInt(5);
				System.out.println(ID+"\t"+Name+"\t"+CountryCode+"\t"+distString+"\t"+populationStr);
			}
			set.close();
			dbl.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
