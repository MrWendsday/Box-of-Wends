package com.person.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.person.person.Person;
import com.person.service.PersonInfoService;



// get individual request parameters
// invoke the service method
// use the parameter to use as arguments for that service method
// transfer the object to the jsp

@WebServlet
(
	name = "personinfoservlet",
	urlPatterns = "/SubmitInfo"
)
public class PersonInfoServlet extends HttpServlet
{	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException 
	{
	long id = Long.parseLong( req.getParameter("id"));
	String name = req.getParameter("name");
	int age = Integer.parseInt(req.getParameter("age"));
	String hobby = req.getParameter("hobby");
	String city = req.getParameter("city");
	
	PersonInfoService personIS = new PersonInfoService();
	Person person = personIS.createPerson(id, name, age, hobby, city);
	
	req.setAttribute("personView", person);
	
	RequestDispatcher view = req.getRequestDispatcher("person.jsp");
	view.forward(req, resp);
	
	}
	
}
