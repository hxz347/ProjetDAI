package ajax.metier;

public class Cours {
	private String nomC;
	private int idC;
	private static int compteur=1;
	private Enseignant e;
	
	
	public Cours(String nomc, Enseignant e) {
		this.idC=compteur++;
		this.nomC = nomc;
		this.e = e;
	}
	
	
	public Cours() {
	}


	public Enseignant getE() {
		return e;
	}


	public void setE(Enseignant e) {
		this.e = e;
	}


	public String getNomc() {
		return nomC;
	}
	public void setNomc(String nomc) {
		this.nomC = nomc;
	}
	public int getIdC() {
		return idC;
	}
	public void setIdC(int idC) {
		this.idC = idC;
	}
	
	
	

}
