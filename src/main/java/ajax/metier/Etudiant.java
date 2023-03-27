package ajax.metier;

import java.sql.Blob;
import java.util.Objects;

public class Etudiant extends User{
	//Propriete
		private Integer idE;
		private Blob photoE;
		private String typeE;
		private String emailE;
		private String formation;
		private static int compteur=1;
		
		
		//Constructeurs
		public Etudiant() {}


		public Etudiant(String nomE, String prenomE, Blob photoE, String typeE, String loginE, String pwdE,
				String emailPE,String formationE) {
			super(nomE,prenomE,loginE,pwdE);
			this.idE =compteur++;
			this.photoE = photoE;
			this.typeE = typeE;	
			this.emailE = emailPE;
		}

		
		//seter et geter
		public Integer getIdE() {
			return idE;
		}


		public void setIdE(Integer idE) {
			this.idE = idE;
		}


		public Blob getPhotoE() {
			return photoE;
		}


		public void setPhotoE(Blob photoE) {
			this.photoE =photoE ;
		}


		public String getTypeE() {
			return typeE;
		}


		public void setTypeE(String typeE) {
			this.typeE = typeE;
		}


		public String getEmailE() {
			return emailE;
		}


		public void setEmailE(String emailE) {
			this.emailE = emailE;
		}


		public String getFormation() {
			return formation;
		}


		public void setFormation(String formation) {
			this.formation = formation;
		}


		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + Objects.hash(emailE, formation, idE, photoE, typeE);
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
			return Objects.equals(emailE, other.emailE) && Objects.equals(formation, other.formation)
					&& Objects.equals(idE, other.idE) && Objects.equals(photoE, other.photoE)
					&& Objects.equals(typeE, other.typeE);
		}


		@Override
		public String toString() {
			return "Etudiant [idE=" + idE + ", photoE=" + photoE + ", typeE=" + typeE + ", emailE=" + emailE
					+ ", formation=" + formation + "]";
		}


		
		


		


		
		
		
		
			

	}