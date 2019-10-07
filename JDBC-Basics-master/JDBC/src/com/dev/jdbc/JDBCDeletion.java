package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCDeletion {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			java.sql.Driver div = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Registered...");
			
			String url = "jdbc:mysql://localhost:3306/caps_mumbai"
					+ "?user=root&password=root";
			con = DriverManager.getConnection(url);
			System.out.println("Connection Established...");
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter The Reg No...");
			int regno = Integer.parseInt(sc.nextLine());
			System.out.println("Enter The Password for Deletion....");
			String pass = sc.nextLine();
			sc.close();
			
			String query = "delete from users_info"
					+ " where user_id=? and password=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, regno);
			pstmt.setString(2,pass);
			
			int count = pstmt.executeUpdate();
			
			if(count>0) {
				System.out.println("Profile Deleted Successfully....");
			}else {
				System.out.println("Unable to delete profile....");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				if(pstmt!=null) {
					try {
						pstmt.close();
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		

	}

}
