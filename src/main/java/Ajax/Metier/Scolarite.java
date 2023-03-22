package Metier;

import java.util.Objects;

//Entite Scolarite
public class Scolarite {
	
	
	//Propriete
	private Integer idS;
	private String login;
	private String pwd;
	private String nom;
	private String prenom;
	
	
	//Constructeurs
	public Scolarite() {}

	public Scolarite(Integer idS, String login, String pwd, String nom, String prenom) {
		super();
		this.idS = idS;
		this.login = login;
		this.pwd = pwd;
		this.nom = nom;
		this.prenom = prenom;
	}
	

	
	
	//Setter /Getter

	public Integer getIdS() {
		return idS;
	}

	public void setIdS(Integer idS) {
		this.idS = idS;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Scolarite [idS=" + idS + ", login=" + login + ", pwd=" + pwd + ", nom=" + nom + ", prenom=" + prenom
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(idS, login, nom, prenom, pwd);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scolarite other = (Scolarite) obj;
		return Objects.equals(idS, other.idS) && Objects.equals(login, other.login) && Objects.equals(nom, other.nom)
				&& Objects.equals(prenom, other.prenom) && Objects.equals(pwd, other.pwd);
	}
	
	
	
	
	
	
	
	

}
