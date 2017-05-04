package com.atmecs.pojo;

public class User
{
	private int employeeId;
	private String emailId;
	private String password;
	private String userType;
	private String employeeName;
	
	public User()
	{
		this(0,"","","","");
	}
	
	public User(int employeeId, String emailId, String password, String userType, String userName)
	{
		this.employeeId = employeeId;
		this.emailId = emailId;
		this.password = password;
		this.userType = userType;
		this.employeeName = userName;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public void setEmployeeId(int employeeId)
	{
		this.employeeId = employeeId;
	}
	
	public String getEmailId()
	{
		return emailId;
	}
	
	public void setEmailId(String emailId)
	{
		this.emailId = emailId;
	}
	
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	public String getUserType()
	{
		return userType;
	}
	public void setUserType(String userType)
	{
		this.userType = userType;
	}
	public String getUserName()
	{
		return employeeName;
	}
	
	public void setUserName(String userName)
	{
		this.employeeName = userName;
	}
	
	public String getEmployeeName()
	{
		return employeeName;
	}

	public void setEmployeeName(String employeeName)
	{
		this.employeeName = employeeName;
	}

	@Override
	public String toString()
	{
		return "User [employeeId=" + employeeId + ", emailId=" + emailId + ", password=" + password + ", userType="
				+ userType + ", userName=" + employeeName + "]";
	}
	
}
