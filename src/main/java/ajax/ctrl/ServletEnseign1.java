package ajax.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;

import ajax.bd.Bd;
import ajax.metier.Seance;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ServletEnseign1
 */
public class ServletEnseign1 extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("login");
		 
		response.setContentType("application/xml;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		try (PrintWriter out = response.getWriter())
		{
		/*----- Ecriture de la page XML -----*/
		out.println("<?xml version=\"1.0\"?>");
		out.println("<semaines>");

		/*----- Récupération des paramètres -----*/
		

		ArrayList<Integer> list=new ArrayList<Integer>();
		//System.out.print(lmots);
		for (int s: list) {
			

			out.println("<semaine>"+s+"</semaine>");
			}

		out.println("</semaines>");
		}
	}
			
		
		
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
