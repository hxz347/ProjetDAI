package ajax.metier;

import java.util.Objects;

public class Etudiant extends User{
	//Propriete
		private Integer idE;
		private String photoE;
		private String typeE;
		private String emailPE;
		private static int compteur=1;
		
		
		//Constructeurs
		public Etudiant() {}


		public Etudiant(String nomE, String prenomE, String photoE, String typeE, String loginE, String pwdE,
				String emailPE) {
			super(nomE,prenomE,loginE,pwdE);
			this.idE =compteur++;
			this.photoE = photoE;
			this.typeE = typeE;	
			this.emailPE = emailPE;
		}

		
		//seter et geter
		public Integer getIdE() {
			return idE;
		}


		public void setIdE(Integer idE) {
			this.idE = idE;
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


		public String getEmailPE() {
			return emailPE;
		}


		public void setEmailPE(String emailPE) {
			this.emailPE = emailPE;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(emailPE, idE, photoE, typeE);
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
			Etudiant other = (Etudiant) obj;
			return Objects.equals(emailPE, other.emailPE) && Objects.equals(idE, other.idE)
					&& Objects.equals(photoE, other.photoE) && Objects.equals(typeE, other.typeE);
		}


		@Override
		public String toString() {
			return "Etudiant [id=" + idE + ", photoE=" + photoE + ", typeE=" + typeE + ", emailPE=" + emailPE + "]";
		}


		
		
		
		
			

	}