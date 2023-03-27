package ajax.metier;

public class Seance {
	private String date;
	private String heureFin;
	private String duree;
	private String heureDebut;
	private int idSeance;
	private int semaine;
	private int numeroSemaine;
	private static int compteur=1;
	private Cours c;
	
	
	public Seance(Cours c,String date, String heureFin, String duree, String heureDebut,int semaine,int numeroSemaine) {
		this.date = date;
		this.heureFin = heureFin;
		this.duree = duree;
		this.heureDebut = heureDebut;
		this.idSeance=compteur++;
		this.semaine=semaine;
		this.numeroSemaine=numeroSemaine;
		this.c=c;
	}
	
	public Seance() {
		super();
	}
	
	public int getNumeroSemaine() {
		return numeroSemaine;
	}

	public void setNumeroSemaine(int numeroSemaine) {
		this.numeroSemaine = numeroSemaine;
	}

	public int getSemaine() {
		return semaine;
	}

	public void setSemaine(int semaine) {
		this.semaine = semaine;
	}

	public Cours getC() {
		return c;
	}

	public void setC(Cours c) {
		this.c = c;
	}

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(String heureFin) {
		this.heureFin = heureFin;
	}
	public String getDuree() {
		return duree;
	}
	public void setDuree(String duree) {
		this.duree = duree;
	}
	public String getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(String heureDebut) {
		this.heureDebut = heureDebut;
	}
	public int getIdSeance() {
		return idSeance;
	}
	public void setIdSeance(int idSeance) {
		this.idSeance = idSeance;
	}

	@Override
	public String toString() {
		return "Seance [date=" + date + ", heureFin=" + heureFin + ", duree=" + duree + ", heureDebut=" + heureDebut
				+ ", idSeance=" + idSeance + ", semaine=" + semaine + ", numeroSemaine=" + numeroSemaine + ", c=" + c
				+ "]";
	}
	
	

}
