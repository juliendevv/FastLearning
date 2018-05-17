package com.sdzee.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sdzee.classe.Utilisateur;

@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	public Servlet1() {
		super();
		this.getServletContext().getRequestDispatcher( "/inscription.jsp" ).forward( request, response );
	}
	
	@Override
	public void init() throws ServletException {
		super.init(); 
		System.err.println("Une erreur s'est produite");
	}
	

	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		Utilisateur unInscrit = new Utilisateur();
		

		
		unInscrit.setNom(""+request.getParameter("name"));
		
		request.setAttribute("Candid",unInscrit);
		
		
		this.getServletContext().getRequestDispatcher( "/test.jsp" ).forward( request, response );
		
	}
}

