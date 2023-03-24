package ajax.bd;

import java.sql.*;
import java.util.ArrayList;

import ajax.metier.Enseignant;

import ajax.metier.*;






//sudo ssh -L 80:localhost:80 22009891@etu-web2.ut-capitole.fr -f -N
//sudo ssh -L 3306:localhost:3306 22009891@etu-web2.ut-capitole.fr -f -N

public class Bd {
	/*---------*/
	/* Données */
	/*---------*/

	/*----- Connexion -----*/
	private static Connection cx = null;

	/*----- Données de connexion -----*/
	private static final String URL			= "jdbc:mysql://localhost:3306/db_22009891_2";
	private static final String LOGIN		= "22009891";
	private static final String PASSWORD	= "V00WJ9";
	
	/*----------*/
	/* Méthodes */
	/*----------*/
	
	/**
	 * Crée la connexion avec la base de données.
	 */
	private static void connexion() throws ClassNotFoundException, SQLException
		{
		/*----- Chargement du pilote pour la BD -----*/
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}
		catch (ClassNotFoundException ex)
			{
			throw new ClassNotFoundException("Exception Bd.connexion() - Pilote MySql introuvable - " + ex.getMessage());
			}

		/*----- Ouverture de la connexion -----*/
		try {
			Bd.cx = DriverManager.getConnection(URL,LOGIN,PASSWORD);
			System.out.print("ok");
			}
		catch (SQLException ex)
			{
			throw new SQLException("Exception Bd.connexion() - Problème de connexion à la base de données - " + ex.getMessage());
			}
		}
	
	
	/*
	 * Verifier la connexion
	 */
	public static User verifierConnexion(String login, String pwd, String type)
			throws ClassNotFoundException, SQLException {
		
		/*----- Création de la connexion à la base de données -----*/
		if (Bd.cx == null) {
			Bd.connexion();
		}

		String sqlEtudiant = "select * from Etudiant where loginE=?";
		String sqlEnseignant = "select * from Enseignant where loginEn=?";
		String sqlScolarite = "select * from Scolarite where login=?";

		// VERIFIER SI LA CONNEXION APPARTIENT UN ETUDIANT
		if (type.equals("Etudiant")) {
			Etudiant etudiant = new Etudiant();

			try (PreparedStatement st = Bd.cx.prepareStatement(sqlEtudiant)) {
				/*----- Exécution de la requête -----*/
				st.setString(1, login);
				try (ResultSet rs = st.executeQuery()) {
					while (rs.next()) {
						if (pwd.equals(rs.getString("pwdE"))) {
							etudiant.setIdE(rs.getInt("idE"));
							etudiant.setNom(rs.getString("nomE"));
							etudiant.setPrenom(rs.getString("prenomE"));
							etudiant.setLogin(rs.getString("loginE"));
							etudiant.setPwd(rs.getString("pwdE"));
							etudiant.setTypeE(rs.getString("typeE"));
							etudiant.setEmailE(rs.getString("emailPE"));
							etudiant.setFormation(rs.getString("formation"));
							
							return etudiant;
						}
					}
				}
			}
		}
		// VERIFIER SI LA CONNEXION APPARTIENT UN ENSEIGNANT
		else if (type.equals("Enseignant")) {
			Enseignant enseignant = new Enseignant();

			try (PreparedStatement st = Bd.cx.prepareStatement(sqlEnseignant)) {
				/*----- Exécution de la requête -----*/
				st.setString(1, login);
				try (ResultSet rs = st.executeQuery()) {
					while (rs.next()) {
						if (pwd.equals(rs.getString("pwdEn"))) {
							enseignant.setIdEn(rs.getInt("idEn"));
							enseignant.setNom(rs.getString("nomEn"));
							enseignant.setPrenom(rs.getString("prenomEn"));
							enseignant.setLogin(rs.getString("loginEn"));
							enseignant.setPwd(rs.getString("pwdEn"));
							
							return enseignant;
						}
					}
				}
			}
		}
		// VERIFIER SI LA CONNEXION APPARTIENT UN SCOLARITE
		else if (type.equals("Scolarite")) {
			Scolarite scolarite = new Scolarite();

			try (PreparedStatement st = Bd.cx.prepareStatement(sqlScolarite)) {
				/*----- Exécution de la requête -----*/
				st.setString(1, login);
				try (ResultSet rs = st.executeQuery()) {
					while (rs.next()) {
						if (pwd.equals(rs.getString("pwd"))) {
							scolarite.setIdS(rs.getInt("idS"));
							scolarite.setNom(rs.getString("nom"));
							scolarite.setPrenom(rs.getString("prenom"));
							scolarite.setLogin(rs.getString("login"));
							scolarite.setPwd(rs.getString("pwd"));
							
							return scolarite;
						}
					}
				}
			}
		}
		
		User user=null;
		return user;
		
	}
	
	/*
	 * récuperer les cours d'un enseignant
	 */
	public static ArrayList<Seance> infoEnseign (String emailEnseign) throws ClassNotFoundException, SQLException
	{
	/*----- Création de la connexion à la base de données -----*/
	if (Bd.cx == null)
		Bd.connexion();

	/*----- Interrogation de la base -----*/
	ArrayList<Seance> seances=new ArrayList<Seance>();

	/*----- Requête SQL -----*/
	String sql = "SELECT *  FROM Enseignant,Cours,Seance,Enseigner WHERE loginEn = ? and Enseignant.idEn=Enseigner.idEn and Cours.idC=Enseigner.idC and Seance.idC=Cours.idC ";

	/*----- Ouverture de l'espace de requête -----*/
	try (PreparedStatement st = Bd.cx.prepareStatement(sql))
		{
		/*----- Exécution de la requête -----*/
		st.setString(1, emailEnseign);
		try (ResultSet rs = st.executeQuery())
			{
			/*----- Lecture du contenu du ResultSet -----*/
			while (rs.next()) {
				Enseignant en=new Enseignant();
				Cours c=new Cours();
				Seance s=new Seance();
				en.setLogin(rs.getString("loginEn"));
				en.setNom(rs.getString("nomEn"));
				en.setPwd(rs.getString("pwdEn"));
				en.setPrenom(rs.getString("prenomEn"));
				c.setE(en);
				c.setNomc(rs.getString("nomC"));
				c.setIdC(rs.getInt("idC"));
				s.setC(c);
				s.setIdSeance(rs.getInt("idSeance"));
				s.setDate(rs.getString("date"));
				s.setDuree(rs.getString("duree"));
				s.setHeureDebut(rs.getString("heureDebut"));
				s.setHeureFin(rs.getString("heureFin"));
				s.setNumeroSemaine(rs.getInt("semaine"));
				s.setSemaine(rs.getInt("numeroSemaine"));
				seances.add(s);
			
			}
				
			}
		}
	catch (SQLException ex)
		{
		throw new SQLException("Exception Bd.listeMot() : Problème SQL - " + ex.getMessage());
		}

	return seances;
	}
	
	public static ArrayList<Seance> infoEnseignSemaine (String emailEnseign,String semaine) throws ClassNotFoundException, SQLException
	{
	/*----- Création de la connexion à la base de données -----*/
	if (Bd.cx == null)
		Bd.connexion();

	/*----- Interrogation de la base -----*/
	ArrayList<Seance> seances=new ArrayList<Seance>();

	/*----- Requête SQL -----*/
	String sql = "SELECT *  FROM Enseignant,Cours,Seance,Enseigner WHERE loginEn = ? and Enseignant.idEn=Enseigner.idEn and Cours.idC=Enseigner.idC and Seance.idC=Cours.idC and semaine =? ";

	/*----- Ouverture de l'espace de requête -----*/
	try (PreparedStatement st = Bd.cx.prepareStatement(sql))
		{
		/*----- Exécution de la requête -----*/
		st.setString(1, emailEnseign);
		st.setString(2, semaine);
		try (ResultSet rs = st.executeQuery())
			{
			/*----- Lecture du contenu du ResultSet -----*/
			while (rs.next()) {
				Enseignant en=new Enseignant();
				Cours c=new Cours();
				Seance s=new Seance();
				en.setLogin(rs.getString("loginEn"));
				en.setNom(rs.getString("nomEn"));
				en.setPwd(rs.getString("pwdEn"));
				en.setPrenom(rs.getString("prenomEn"));
				c.setIdC(rs.getInt("idC"));
				c.setE(en);
				c.setNomc(rs.getString("nomC"));
				s.setC(c);

				s.setIdSeance(rs.getInt("idSeance"));
				s.setDate(rs.getString("date"));
				s.setDuree(rs.getString("duree"));
				s.setHeureDebut(rs.getString("heureDebut"));
				s.setHeureFin(rs.getString("heureFin"));
				s.setNumeroSemaine(rs.getInt("numeroSemaine"));
				s.setSemaine(rs.getInt("semaine"));
				seances.add(s);
			
			}
				
			}
		}
	catch (SQLException ex)
		{
		throw new SQLException("Exception Bd.listeMot() : Problème SQL - " + ex.getMessage());
		}

	return seances;
	}
	
	
	public static ArrayList<Integer> listSemaine(String id) throws Exception{
		//verifier est-ce que bd a déja connecté
		if(Bd.cx==null) {
			Bd.connexion();
		}
		ArrayList<Integer> list=new ArrayList<Integer>();
		String sql="SELECT distinct(semaine) FROM Enseignant,Cours,Seance,Enseigner WHERE loginEn = ? and Enseignant.idEn=Enseigner.idEn and Cours.idC=Enseigner.idC and Seance.idC=Cours.idC  ";
	
			//ouvrir espace de requete
			try(PreparedStatement st=cx.prepareStatement(sql)) {
				st.setString(1, id);
				//st.setString();
				try (ResultSet rs = st.executeQuery())
				{
				/*----- Lecture du contenu du ResultSet -----*/
				while (rs.next()) {
					list.add(rs.getInt(1));
					//System.out.println(rs.getInt(1));
				}	
				}
				
			}catch(SQLException sqle) {
				throw new Exception("Bd.supprimerMessage() - Errur à l'supprimer"+sqle);
			}
		return list;
	}
	
	public static ArrayList<Etudiant> listEtudiant(String idS) throws Exception{
		//verifier est-ce que bd a déja connecté
		if(Bd.cx==null) {
			Bd.connexion();
		}
		ArrayList<Etudiant> list=new ArrayList<Etudiant>();
		String sql="SELECT * FROM Seance,Etudiant,Participer WHERE Etudiant.idE=Participer.idE and Participer.idSeance=Seance.idSeance and Seance.idSeance=?";
			
			//ouvrir espace de requete
			try(PreparedStatement st=cx.prepareStatement(sql)) {
				st.setString(1, idS);
				//st.setString();
				try (ResultSet rs = st.executeQuery())
				{
				/*----- Lecture du contenu du ResultSet -----*/
				while (rs.next()) {
					Etudiant e=new Etudiant();
					e.setEmailE(rs.getString("emailPE"));
					e.setIdE(rs.getInt("idE"));
					e.setNom(rs.getString("nomE"));
					//e.setPhotoE(sql);
					e.setPrenom(rs.getString("prenomE"));
					e.setTypeE(rs.getString("typeE"));
					list.add(e);
			
				}	
				}
				
			}catch(SQLException sqle) {
				throw new Exception("Bd.supprimerMessage() - Errur à l'supprimer"+sqle);
			}
		return list;
	}
	/*
	 * programe de test
	 */
	public static void main(String[] args) {
		try {
			Bd.connexion();
			ArrayList<Seance> seances=Bd.infoEnseignSemaine("bour@123.com","1");
			for(int i=1;i<seances.size();i++) {
				//System.out.println(seances.get(i).getSemaine()+" "+seances.get(i).getNumeroSemaine());
			}
			ArrayList<Integer> list=Bd.listSemaine("bour@123.com");
			System.out.println(list.size());
			for(int i=1;i<list.size();i++) {
				//System.out.println(list.get(i));
			}
			ArrayList<Etudiant> listEtu=Bd.listEtudiant("1");
			System.out.println(listEtu.size());
			for(int i=1;i<listEtu.size();i++) {
				System.out.println(listEtu.get(i).getNom());
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}


}
