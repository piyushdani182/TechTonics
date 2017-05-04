package com.atmecs.utilities;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.atmecs.dao.SignInDao;
import com.atmecs.pojo.User;

/**
 * Servlet implementation class SignIn
 */
@WebServlet("/SignIn")
public class SignIn extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	private SignInDao signInDao=new SignInDao();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String emailId=request.getParameter("form-username");
		String password=request.getParameter("form-password");
		try
		{
			User user=signInDao.validateUser(emailId, password);
			if(user!=null)
			{
				HttpSession session=request.getSession();
				session.setAttribute("user", user);
				if(user.getUserType().equalsIgnoreCase("admin"))
					request.getRequestDispatcher("AdminTT").forward(request, response);
				else
					request.getRequestDispatcher("EmpTT").forward(request, response);
			}
			else
			{
				request.setAttribute("info", "Sign In Failed!!!");
				request.getRequestDispatcher("signin.jsp").forward(request, response);
			}
				
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
