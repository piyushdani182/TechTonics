package com.atmecs.utilities;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.atmecs.dao.TechTalksDao;
import com.atmecs.pojo.TechTalk;

@WebServlet("/EmpTT")
public class EmpTT extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		TechTalksDao techTalksDao=new TechTalksDao();
		try
		{
			ArrayList<TechTalk> techTalks=techTalksDao.getTTList();
			System.out.println(techTalks);
			request.setAttribute("ttList", techTalks);
			request.getRequestDispatcher("empHome.jsp").forward(request, response);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
