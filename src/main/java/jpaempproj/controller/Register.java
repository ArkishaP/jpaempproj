package jpaempproj.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jersey.spi.dispatch.RequestDispatcher;

import jpaempproj.model.Employees;
import jpaempproj.service.EmpDao;

/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String mailid = request.getParameter("mailid");
		String gender = request.getParameter("gender");
		Employees emp = new Employees(id, name, password, mailid, gender);
		boolean flag = new EmpDao().addEmp(emp);
		if(flag) {
			response.sendRedirect("login.jsp");
		}else {
			System.out.println("Error!");
			response.sendRedirect("register.jsp");
		}
	}

}
