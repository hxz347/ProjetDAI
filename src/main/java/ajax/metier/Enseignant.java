package ajax.metier;
import java.util.Objects;

public class Enseignant {
	//Propriete
	private Integer idEn;
	private String nomEn;
	private String prenomEn;
	private String loginEn;
	private String pwdEn;
	private static int compteur=1;
	
	
	//Constructeurs
	public Enseignant() {}


	public Enseignant( String nomEn, String prenomEn, String loginEn, String pwdEn) {
		super();
		this.idEn = compteur++;
		this.nomEn = nomEn;
		this.prenomEn = prenomEn;
		this.loginEn = loginEn;
		this.pwdEn = pwdEn;
	}


	public Integer getIdEn() {
		return idEn;
	}


	public void setIdEn(Integer idEn) {
		this.idEn = idEn;
	}


	public String getNomEn() {
		return nomEn;
	}


	public void setNomEn(String nomEn) {
		this.nomEn = nomEn;
	}


	public String getPrenomEn() {
		return prenomEn;
	}


	public void setPrenomEn(String prenomEn) {
		this.prenomEn = prenomEn;
	}


	public String getLoginEn() {
		return loginEn;
	}


	public void setLoginEn(String loginEn) {
		this.loginEn = loginEn;
	}


	public String getPwdEn() {
		return pwdEn;
	}


	public void setPwdEn(String pwdEn) {
		this.pwdEn = pwdEn;
	}


	@Override
	public String toString() {
		return "Enseignant [idEn=" + idEn + ", nomEn=" + nomEn + ", prenomEn=" + prenomEn + ", loginEn=" + loginEn
				+ ", pwdEn=" + pwdEn + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(idEn, loginEn, nomEn, prenomEn, pwdEn);
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
		return Objects.equals(idEn, other.idEn) && Objects.equals(loginEn, other.loginEn)
				&& Objects.equals(nomEn, other.nomEn) && Objects.equals(prenomEn, other.prenomEn)
				&& Objects.equals(pwdEn, other.pwdEn);
	}
	
	
	
	
	

}