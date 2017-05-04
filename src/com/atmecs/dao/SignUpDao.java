package com.atmecs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import com.atmecs.dbconnection.DatabaseConnection;
import com.atmecs.pojo.User;

public class SignUpDao
{
	public int registerUser(User user) throws Exception
	{
		Connection connection=DatabaseConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into users values(?,?,?,?,?)");
		preparedStatement.setInt(1, user.getEmployeeId());
		preparedStatement.setString(2, user.getUserName());
		preparedStatement.setString(3, user.getEmailId());
		preparedStatement.setString(4, user.getPassword());
		preparedStatement.setString(5,user.getUserType());
		int success=preparedStatement.executeUpdate();
		return success;
	}
}
