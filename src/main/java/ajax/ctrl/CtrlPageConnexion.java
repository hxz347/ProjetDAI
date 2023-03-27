package ajax.ctrl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.Base64;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import ajax.bd.Bd;
import ajax.metier.Enseignant;
import ajax.metier.Etudiant;
import ajax.metier.Scolarite;
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
		final String type=request.getParameter("type");
		
		switch(type){
			case "Etudiant":
				try {
					Etudiant user=(Etudiant)Bd.verifierConnexion(login, pwd, type);
					if(user==null) {
						String msg_erreur="Erreur de login ou de mot de passe ou de type, veuillez vérifier votre saisie !";
						System.out.println(msg_erreur);
						request.setAttribute("msg_erreur", msg_erreur);
						session.invalidate();
						request.getRequestDispatcher("Accueil").forward(request, response);
					}
					//Chainage vers des pages menus
					else {
						
						Blob imageBlob=user.getPhotoE();
						//获取Blob对象的二进制流;        
			            InputStream imgInS=imageBlob.getBinaryStream();
			            
			            byte[] imageBytes = imageBlob.getBytes(1, (int) imageBlob.length()); // 将Blob类型的图片转换为byte[]类型
			            String encodedImage = Base64.getEncoder().encodeToString(imageBytes); // 将图片数据转换为base64编码字符串
			            session.setAttribute("encodedImage", encodedImage); // 将编码字符串存入session对象
			            
						session.setAttribute("user", user);
						request.getRequestDispatcher("Etudiant").forward(request, response);
					    break;
						}
					}
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
					String msg_erreur="Notre serveur est en cours de maintenance, veuillez réessayer plus tard !";
					request.setAttribute("msg_erreur", msg_erreur);
					session.invalidate();
					request.getRequestDispatcher("Accueil").forward(request, response);
					break;
				}
				
			case "Enseignant":
				try {
					Enseignant user=(Enseignant)Bd.verifierConnexion(login, pwd, type);
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
						request.getRequestDispatcher("Enseignant").forward(request, response);
						break;
						}
					}
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
					String msg_erreur="Notre serveur est en cours de maintenance, veuillez réessayer plus tard !";
					request.setAttribute("msg_erreur", msg_erreur);
					session.invalidate();
					request.getRequestDispatcher("Accueil").forward(request, response);
					break;
				}
			case "Scolarite":
				try {
					Scolarite user=(Scolarite)Bd.verifierConnexion(login, pwd, type);
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
						request.getRequestDispatcher("Scolarite").forward(request, response);
						break;
						}
					}
				catch (ClassNotFoundException | SQLException e) {
					e.printStackTrace();
					String msg_erreur="Notre serveur est en cours de maintenance, veuillez réessayer plus tard !";
					request.setAttribute("msg_erreur", msg_erreur);
					session.invalidate();
					request.getRequestDispatcher("Accueil").forward(request, response);
					break;
				}
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
