package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCInsertion {

	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			java.sql.Driver div = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(div);
			System.out.println("Driver Resgistered...");

			String dbUrl="jdbc:mysql://localhost:3306/caps_htd"
					+ "?user=root&password=root";
			con = DriverManager.getConnection(dbUrl);
			System.out.println("Established Connection....");
			System.out.println("**********************************");

			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Reg No.");
			int regno = Integer.parseInt(sc.nextLine());
			System.out.println("Enter First Name");
			String fname = sc.nextLine();
			System.out.println("Enter Last Name");
			String lname = sc.nextLine();
			System.out.println("Enter E-mail");
			String email = sc.nextLine();
			System.out.println("Enter Password..");
			String pass = sc.nextLine();
			String query = "insert into demo_tab"
					+ " values(?,?,?,?,?)";
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1,regno);
			pstmt.setString(2,fname);
			pstmt.setString(3,lname);
			pstmt.setString(4,email);
			pstmt.setString(5,pass);
			
			sc.close();
			int count=pstmt.executeUpdate();
			if(count>0) {
				System.out.println("Data Successfully Uploaded...");
			}else {
				System.out.println("Failed to upload Data....");
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
