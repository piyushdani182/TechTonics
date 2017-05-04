package com.atmecs.utilities;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atmecs.dao.TechTalksDao;
import com.atmecs.pojo.TechTalk;

@WebServlet("/AddTT")
public class AddTT extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name=request.getParameter("name");
		String description=request.getParameter("description");
		String date=request.getParameter("date");
		String presenter=request.getParameter("presenter");
		TechTalksDao techTalksDao =new TechTalksDao();
		try
		{
			techTalksDao.addTT(new TechTalk(0,name,description,date,presenter));
			request.getRequestDispatcher("AdminTT").forward(request, response);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
