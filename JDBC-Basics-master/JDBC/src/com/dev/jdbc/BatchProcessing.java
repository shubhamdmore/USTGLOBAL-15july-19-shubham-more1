package com.dev.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) {
		
		String url = "jdbc:mysql://localhost:3306/ustglobal"
				+ "?user=root&password=root";
		
		try(Connection conn = DriverManager.getConnection(url);
				Statement stmt = conn.createStatement()) {
			Class.forName("com.mysql.jdbc.Driver");
			
			String query1 = "INSERT INTO usersinfo values(2019008,'Peter Parker','peter.p@avengers.com','maryjane')";
			stmt.addBatch(query1);
			
			String query2 = "INSERT INTO usersinfo values(2019009,'Bucky Barns','barns.b@avengers.com','wintersoilder')";
			stmt.addBatch(query2);
			
			int[] count = stmt.executeBatch();
			
			if(count!=null) {
				System.out.println("Data Added");
			}else {
				System.out.println("Uable to add data");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
