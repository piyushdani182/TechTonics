package com.atmecs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.atmecs.dbconnection.DatabaseConnection;
import com.atmecs.pojo.User;

public class SignInDao
{
	public User validateUser(String emailId,String password) throws Exception
	{
		Connection connection=DatabaseConnection.getConnection();
		PreparedStatement statement=connection.prepareStatement("select * from users where EmailId=? and Password=?;");
		statement.setString(1, emailId);
		statement.setString(2, password);
		ResultSet resultSet = statement.executeQuery();
		User user=new User();
		if(resultSet.next())
		{
			user.setEmployeeId(resultSet.getInt(1));
			user.setUserName(resultSet.getString(2));
			user.setPassword(resultSet.getString(4));
			user.setEmailId(resultSet.getString(3));
			user.setUserType(resultSet.getString(5));
			return user;
		}
		return null;
	}
}
