package ajax.metier;

import java.util.Objects;

public class Scolarite extends User{
	
	//propriete
	private Integer idS;
	private static int compteur=1;
	
	//constructor
	public Scolarite(String nom, String prenom, String login, String pwd) {
		super(nom,prenom,login,pwd);
		this.idS=compteur++;
	}
	
	public Scolarite() {
	}
	
	//getter et setter
	public Integer getIdS() {
		return idS;
	}
	public void setIdS(Integer idS) {
		this.idS = idS;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(idS);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Scolarite other = (Scolarite) obj;
		return Objects.equals(idS, other.idS);
	}

	@Override
	public String toString() {
		return "Scolarite [idS=" + idS + "]";
	}
	
}
