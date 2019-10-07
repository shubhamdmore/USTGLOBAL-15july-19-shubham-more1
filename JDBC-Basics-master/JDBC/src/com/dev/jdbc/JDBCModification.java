package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCModification {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			java.sql.Driver div = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Registered....");

			String url = "jdbc:mysql://localhost:3306/caps_htd"
					+ "?user=root&password=root";
			con = DriverManager.getConnection(url);
			System.out.println("Connection Established...");
			System.out.println("**************************");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Reg No...");
			int regno = Integer.parseInt(sc.nextLine());
			System.out.println("Enter New E-mail id.....");
			String n_email = sc.nextLine();
			System.out.println("Enter the password for e-mail upgradation....");
			String pass = sc.nextLine();
			sc.close();
			String query = "update demo_tab set e_mail=?"
					+ " where regno=? and password=?";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(2,regno);
			pstmt.setString(1,n_email);
			pstmt.setString(3,pass);

			int count = pstmt.executeUpdate();

			if(count>0) {
				System.out.println("Profile Updated....");
			}else {
				System.out.println("Unable to update....");
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
