package com.dal.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;// import java.sql.PreparedStatement/ java.sql.Statement (By importing these interfaces, we can then use their methods to execute SQL queries against the database.)

public class UpdateTable {
	public static void main(String[]args) {
			String sql = "UPDATE emp SET Column1 =?, Column2 =?, WHERE id=?";
		try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Sivamazzeo123");
				PreparedStatement statement = connection.prepareStatement(sql)){
			statement.setString(1,"The new value for Colum1");
			statement.setString(2,"The new Value for Colum2");
		    statement.setInt(3,12123);
		    int rowsUpdate = statement.executeUpdate();
		    System.out.println(rowsUpdate +  "Result");
	}
		catch(SQLException e1) {
			e1.printStackTrace();
		}
     }
   }
