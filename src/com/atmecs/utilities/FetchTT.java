package com.atmecs.utilities;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.atmecs.dao.TechTalksDao;
import com.atmecs.pojo.TechTalk;

@WebServlet("/FetchTT")
public class FetchTT extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		doPost(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int ttId = Integer.parseInt(request.getParameter("id"));
		TechTalksDao techTalksDao=new TechTalksDao();
		TechTalk techTalk;
		try
		{
			techTalk = techTalksDao.getTechTalk(ttId);
			if(techTalk!=null)
			{
				request.setAttribute("techTalk", techTalk);
				request.getRequestDispatcher("updateTT.jsp").forward(request, response);
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
