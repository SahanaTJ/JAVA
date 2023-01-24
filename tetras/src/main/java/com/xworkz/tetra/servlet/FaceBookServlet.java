package com.xworkz.tetra.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(loadOnStartup = 5,urlPatterns = "/facebook")

public class FaceBookServlet extends HttpServlet {

	public FaceBookServlet() {
		System.out.println("Creating FaceBookServlet.....");
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Running FaceBookServlet......");
		super.doGet(req, resp);
	}
}
