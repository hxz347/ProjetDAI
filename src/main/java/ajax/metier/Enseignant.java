package ajax.metier;
import java.util.Objects;

public class Enseignant extends User {
	//Propriete
	private Integer idEn;
	private static int compteur=1;
	
	
	//Constructeurs
	public Enseignant() {}


	public Enseignant( String nomEn, String prenomEn, String loginEn, String pwdEn) {
		super(nomEn,prenomEn,loginEn,pwdEn);
		this.idEn = compteur++;
	}


	public Integer getIdEn() {
		return idEn;
	}


	public void setIdEn(Integer idEn) {
		this.idEn = idEn;
	}



	@Override
	public String toString() {
		return "Enseignant [idEn=" + idEn + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idEn);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Enseignant other = (Enseignant) obj;
		return Objects.equals(idEn, other.idEn) ;
	}
	
	
	
	
	

}