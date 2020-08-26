package com.ecommerce;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection connection;
	
	public DBConnection(String dbURL,String user,String password) throws ClassNotFoundException,SQLException {
		Class.forName("org.postgresql.Driver");
		this.connection = DriverManager.getConnection(dbURL,user,password);
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public void closeConnection() throws SQLException {
		if(this.connection != null) {
			this.connection.close();
		}
	}
	
	
}
