package com.dev.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

public class FirstJDBC {

	public static void main(String[] args) {

		Connection con = null; 
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//Load The Driver
			java.sql.Driver div = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Loaded....");

			//Get The DB Connection
			String dbUrl="jdbc:mysql://localhost:3306/caps_htd"
					+ "?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			System.out.println("Connection Established....");
			System.out.println("-------------------------------------");

			//Issue Query via Connection
			String query = "select * from demo_tab";
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);

			//Process the Results
			while(rs.next()) {
				int regno = rs.getInt("regno");
				String fname= rs.getString("f_name");
				String lname = rs.getString("l_name");
				String email = rs.getString("e_mail");
				System.out.println(regno);
				System.out.println(fname);
				System.out.println(lname);
				System.out.println(email);
				System.out.println("************************************");
			}

		} catch (SQLException e) {
			e.printStackTrace();	
		}
		//Close All  the JDBC Objects
		finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(stmt!=null) {
					try {
						stmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
					if(rs!=null) {
						try {
							rs.close();
						} catch (SQLException e) {
							e.printStackTrace();
						}
					}
				}
			}
		}

	}
}
