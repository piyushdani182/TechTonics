package com.atmecs.utilities;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atmecs.dao.SignInDao;
import com.atmecs.dao.SignUpDao;
import com.atmecs.pojo.User;

@WebServlet("/SignUp")
public class SignUp extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String empId=request.getParameter("empId");
		String empName=request.getParameter("empName");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		String userType="Employee";
		System.out.println(empId);
		System.out.println(empName);
		System.out.println(emailId);
		System.out.println(password);
		User user=new User();
		SignInDao signInDao=new SignInDao();
		SignUpDao signUpDao=new SignUpDao();
		try
		{
			if((user=signInDao.validateUser(emailId, password))==null)
			{
				User newUser=new User();
				newUser.setEmployeeId(Integer.parseInt(empId));
				newUser.setUserName(empName);
				newUser.setUserType(userType);
				newUser.setEmailId(emailId);
				newUser.setPassword(password);
				if(signUpDao.registerUser(newUser)!=0)
				{
					request.setAttribute("info", "Sign Up Sucessful!!!Proceed to Login!!!");
					request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
				else
				{
					request.setAttribute("info", "Sign Up Failed!!!");
					request.getRequestDispatcher("signup.jsp").forward(request, response);
				}
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
