package com.atmecs.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import com.atmecs.dbconnection.DatabaseConnection;
import com.atmecs.pojo.TechTalk;
import java.sql.ResultSet;

public class TechTalksDao
{
	public ArrayList<TechTalk> getTTList() throws Exception
	{
		Connection connection=DatabaseConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from TechTalks");
		ResultSet resultSet=preparedStatement.executeQuery();
		ArrayList<TechTalk> ttList=new ArrayList<>();
		while(resultSet.next())
		{
			TechTalk techTalk=new TechTalk(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4)
					,resultSet.getString(5));
			ttList.add(techTalk);
		}
		return ttList;
	}
	
	public TechTalk getTechTalk(int ttId) throws Exception
	{
		Connection connection=DatabaseConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("select * from TechTalks where TTId=?");
		preparedStatement.setInt(1, ttId);
		ResultSet resultSet=preparedStatement.executeQuery();
		TechTalk techTalk=null;
		while(resultSet.next())
		{
			techTalk=new TechTalk(resultSet.getInt(1),resultSet.getString(2),resultSet.getString(3),resultSet.getString(4),resultSet.getString(5));
		}
		return techTalk;
	}
	
	public int updateTT(TechTalk techTalk) throws Exception
	{
		Connection connection=DatabaseConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("update techtalks set Name=?,Description=?,Date=?,ConductedBy=? where TTId=?");
		preparedStatement.setString(1, techTalk.getName());
		preparedStatement.setString(2, techTalk.getDescription());
		preparedStatement.setString(3, techTalk.getDate());
		preparedStatement.setString(4, techTalk.getPresenter());
		preparedStatement.setInt(5, techTalk.getId());
		return preparedStatement.executeUpdate();
	}
	
	public int delete(int id) throws Exception
	{
		Connection connection=DatabaseConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("delete from techtalks where TTId=?");
		preparedStatement.setInt(1, id);
		return preparedStatement.executeUpdate();
	}
	
	public void addTT(TechTalk techTalk) throws Exception
	{
		Connection connection=DatabaseConnection.getConnection();
		PreparedStatement preparedStatement=connection.prepareStatement("insert into techtalks values(?,?,?,?,?);");
		//int id=0;
		preparedStatement.setInt(1, 0);
		//preparedStatement.setString(1,"0");
		preparedStatement.setString(2, techTalk.getName());
		preparedStatement.setString(3, techTalk.getDescription());
		preparedStatement.setString(4, techTalk.getDate());
		preparedStatement.setString(5, techTalk.getPresenter());
		preparedStatement.execute();
	}
}
