package com.ankita;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EServletController extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		pw.println("Welocome to Electronics\n");
		ServletConfig config=getServletConfig();
		String sc=config.getInitParameter("el");
		pw.println(sc);
		ServletContext conf=getServletContext();
		String sco=conf.getInitParameter("ec");
		pw.println(sco);
	}

}
