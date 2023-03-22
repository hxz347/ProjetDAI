package ajax.metier;

import java.util.Objects;

public class Etudiant {
	//Propriete
		private Integer idE;
		private String nomE;
		private String prenomE;
		private String photoE;
		private String typeE;
		private String loginE;
		private String pwdE;
		private String emailPE;
		private static int compteur=1;
		
		
		//Constructeurs
		public Etudiant() {}


		public Etudiant(String nomE, String prenomE, String photoE, String typeE, String loginE, String pwdE,
				String emailPE) {
			super();
			this.idE =compteur++;
			this.nomE = nomE;
			this.prenomE = prenomE;
			this.photoE = photoE;
			this.typeE = typeE;
			this.loginE = loginE;
			this.pwdE = pwdE;
			this.emailPE = emailPE;
		}

		
		//seter et geter
		public Integer getIdE() {
			return idE;
		}


		public void setIdE(Integer idE) {
			this.idE = idE;
		}


		public String getNomE() {
			return nomE;
		}


		public void setNomE(String nomE) {
			this.nomE = nomE;
		}


		public String getPrenomE() {
			return prenomE;
		}


		public void setPrenomE(String prenomE) {
			this.prenomE = prenomE;
		}


		public String getPhotoE() {
			return photoE;
		}


		public void setPhotoE(String photoE) {
			this.photoE = photoE;
		}


		public String getTypeE() {
			return typeE;
		}


		public void setTypeE(String typeE) {
			this.typeE = typeE;
		}


		public String getLoginE() {
			return loginE;
		}


		public void setLoginE(String loginE) {
			this.loginE = loginE;
		}


		public String getPwdE() {
			return pwdE;
		}


		public void setPwdE(String pwdE) {
			this.pwdE = pwdE;
		}


		public String getEmailPE() {
			return emailPE;
		}


		public void setEmailPE(String emailPE) {
			this.emailPE = emailPE;
		}


		@Override
		public String toString() {
			return "Etudiant [idE=" + idE + ", nomE=" + nomE + ", prenomE=" + prenomE + ", photoE=" + photoE + ", typeE="
					+ typeE + ", loginE=" + loginE + ", pwdE=" + pwdE + ", emailPE=" + emailPE + "]";
		}


		@Override
		public int hashCode() {
			return Objects.hash(emailPE, idE, loginE, nomE, photoE, prenomE, pwdE, typeE);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Etudiant other = (Etudiant) obj;
			return Objects.equals(emailPE, other.emailPE) && Objects.equals(idE, other.idE)
					&& Objects.equals(loginE, other.loginE) && Objects.equals(nomE, other.nomE)
					&& Objects.equals(photoE, other.photoE) && Objects.equals(prenomE, other.prenomE)
					&& Objects.equals(pwdE, other.pwdE) && Objects.equals(typeE, other.typeE);
		}
		
		
		
			

	}