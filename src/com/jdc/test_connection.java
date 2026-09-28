package com.jdc;

import java.sql.Connection;

public class test_connection {
	public static void main(String[] args) {
		try {
			Connection connection = DB_Connection.getConnection();
			
			System.out.println("DataBase Connected Successfully!");
			connection.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}