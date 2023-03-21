package Ajax.Bd;

import java.sql.*;



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
	 * programe de test
	 */
	public static void main(String[] args) {
		try {
			Bd.connexion();
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}


}
