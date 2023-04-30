package com.dal.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DeleteTable {
	public static void main(String []args) {
		String sql = "DELETE emps WHERE id =?";
		try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Sivamazzeo123");
				PreparedStatement statement = connection.prepareStatement(sql)){
			    statement.setInt(3, 267618);
			    int rowAffected = statement.executeUpdate();
			    System.out.println(rowAffected + "rowsDeleted");
		
		}
		catch(SQLException e){
			e.printStackTrace();
		}
	}

}
