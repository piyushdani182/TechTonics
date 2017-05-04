package com.atmecs.utilities;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atmecs.dao.TechTalksDao;
import com.atmecs.pojo.TechTalk;


@WebServlet("/UpdateTT")
public class UpdateTT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String description=request.getParameter("description");
		String date=request.getParameter("date");
		String presenter=request.getParameter("presenter");
		TechTalksDao techTalksDao=new TechTalksDao();
		
		try
		{
			techTalksDao.updateTT(new TechTalk(id,name,description,date,presenter));
			request.getRequestDispatcher("AdminTT").forward(request, response);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
