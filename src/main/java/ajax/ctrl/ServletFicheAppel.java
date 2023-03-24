package ajax.ctrl;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import ajax.bd.Bd;
import ajax.metier.Etudiant;
import ajax.metier.Seance;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFicheAppel
 */
public class ServletFicheAppel extends HttpServlet {
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/xml;charset=UTF-8");
		response.setCharacterEncoding("UTF-8");
		String nom = request.getParameter("login");
		String idC=(String)request.getParameter("idC");
		String idS=(String)request.getParameter("idS");
		ArrayList<Etudiant> etudiants;
		try {
			etudiants = Bd.listEtudiant(idS);
			request.setAttribute("etudiants",etudiants);
			request.getRequestDispatcher("FicherAppel").forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//
		
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

}
