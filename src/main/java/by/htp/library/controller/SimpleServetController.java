package by.htp.library.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import by.htp.library.action.BaseAction;
import by.htp.library.action.util.ActionManager;

/**
 * Servlet implementation class SimpleServetController
 */
public class SimpleServetController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public SimpleServetController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userAction = request.getParameter("action");
		
		int value = Integer.parseInt(userAction);
		
		BaseAction action = ActionManager.defineAction(value);
		
		PrintWriter out = response.getWriter();
		action.doSmth(out);
		
		//response.getWriter().append("Hello again!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
