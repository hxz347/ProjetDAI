package ajax.metier;

public class Scolarite {
	private Integer idS;
	private String nom;
	private String prenom;
	private String login;
	private String pwd;
	private static int compteur=1;
	public Scolarite(String nom, String prenom, String login, String pwd) {
		this.idS=compteur++;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.pwd = pwd;
	}
	public Scolarite() {
	}
	public Integer getIdS() {
		return idS;
	}
	public void setIdS(Integer idS) {
		this.idS = idS;
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
	
}
