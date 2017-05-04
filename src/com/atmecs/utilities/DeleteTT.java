package com.atmecs.utilities;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atmecs.dao.TechTalksDao;

@WebServlet("/DeleteTT")
public class DeleteTT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int id=Integer.parseInt(request.getParameter("id"));
		TechTalksDao techTalksDao=new TechTalksDao();
		try
		{
			techTalksDao.delete(id);
			request.getRequestDispatcher("AdminTT").forward(request, response);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
