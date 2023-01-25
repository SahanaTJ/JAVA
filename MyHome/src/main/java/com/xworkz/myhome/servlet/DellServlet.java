package com.xworkz.myhome.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebFault;

@WebServlet(loadOnStartup = 1,urlPatterns = "/petails")
public class DellServlet extends HttpServlet {

	private ServletResponse resp;
	private PrintWriter writer;
	public DellServlet() {
		System.out.println("Creating Dell Servlet....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running Dell servlet on using doGet method....");
		String data = "Dell laptop !!,Dell deskop!!,dell charger";
		PrintWriter writer = resp.getWriter();
	    writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("Running dell servlet on using init method....");
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dell servlet on using doPost method....");
		
	}
	
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dell servlet on using doPut method......");
		String data = "Dell laptop !!,Dell deskop!!,dell charger";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running dell servlet on  using doDelete method.....");
	
	}
	
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running dell servlet on using doHead method...");
		
	}
  
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running dell servlet on using doOptions method...");
	
	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	System.out.println("Running dell servlet on using doTrace method");
	
	}
}
	
	

