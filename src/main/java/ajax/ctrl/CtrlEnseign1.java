package ajax.ctrl;

import java.io.IOException;
import java.util.ArrayList;

import ajax.bd.Bd;
import ajax.metier.Seance;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet implementation class CtrlEnseign1
 */
public class CtrlEnseign1 extends HttpServlet {
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("id");
		HttpSession session=request.getSession();
		ArrayList<Seance> seances=new ArrayList<Seance>();
		try {
			//chargement des messages de la BD
			seances=Bd.infoEnseign(id);
			//chainage vers la page lire.jsp
			request.setAttribute("listSeances",seances);
			request.getRequestDispatcher("Enseignant").forward(request, response);
			
		} catch (Exception e) {
			//request.setAttribute("lire_erreur",e.getMessage());
			request.getRequestDispatcher("Accueil").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
