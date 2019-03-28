package com.ragnarok.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;

import javax.servlet.ServletException;

@WebServlet(name = "GameServlet", urlPatterns = { "/gameServlet" })
/*, initParams = {
		@WebInitParam(name = "name", value = "Not provided"), @WebInitParam(name = "gender", value = "Not provided") })*/
public class GameServlet extends HttpServlet
{

	private static final long serialVersionUID = 7181596308938889732L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		processRequest(request, response);
		forwardRequest(request, response, "/WEB-INF/jsp/result.jsp");
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		request.setAttribute("name", getRequestParameter(request, "name"));
		request.setAttribute("gender", getRequestParameter(request, "gender"));
		request.setAttribute("game1", getContextParameter("game1"));
        request.setAttribute("game2", getContextParameter("game2"));
	}

	protected void forwardRequest(HttpServletRequest request, HttpServletResponse response, String path)
			throws ServletException, IOException
	{
		request.getRequestDispatcher(path).forward(request, response);
	}

	protected String getRequestParameter(HttpServletRequest request, String name)
	{
		String param = request.getParameter(name);
		return !param.isEmpty() ? param : getInitParameter(name);
	}
	
	protected String getContextParameter(String name) {
        return getServletContext().getInitParameter(name);
    }

}
