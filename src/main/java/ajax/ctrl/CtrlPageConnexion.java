package ajax.ctrl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

import ajax.bd.Bd;
import ajax.metier.Enseignant;
import ajax.metier.Etudiant;
import ajax.metier.User;

/**
 * Servlet implementation class CtrlPageConnexion
 */
public class CtrlPageConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CtrlPageConnexion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		//obtenir les informations que l'utilisateur saisit
		String login=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		String type=request.getParameter("type");
		
		try {
			User user=Bd.verifierConnexion(login, pwd, type);
			if(user==null) {
				String msg_erreur="Erreur de login ou de mot de passe ou de type, veuillez vérifier votre saisie !";
				System.out.println(msg_erreur);
				request.setAttribute("msg_erreur", msg_erreur);
				session.invalidate();
				request.getRequestDispatcher("Accueil").forward(request, response);
			}
			//Chainage vers des pages menus
			else {
				session.setAttribute("user", user);
				switch(type){
					case "Etudiant":
						System.out.println(type);
						request.getRequestDispatcher("Etudiant").forward(request, response);
						break;
					case "Enseignant":
						request.getRequestDispatcher("Enseignant").forward(request, response);
						break;
					case "Scolarite":
						request.getRequestDispatcher("Scolarite").forward(request, response);
						break;
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
