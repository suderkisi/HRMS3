package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

	
	@Entity
	@Table(name="Users")
	public class Users {
		
		
		@Id
		@GeneratedValue
		@Column(name="id")
		private int id;
		
		@Column(name="email")
		private String email;
		
		@Column(name="password")
		private String paswword;
		
		
		@Column(name="email_verification")
		private boolean verify;


		public Users(int id, String email, String paswword, boolean verify) {
			super();
			this.id = id;
			this.email = email;
			this.paswword = paswword;
			this.verify = verify;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPaswword() {
			return paswword;
		}


		public void setPaswword(String paswword) {
			this.paswword = paswword;
		}


		public boolean isVerify() {
			return verify;
		}


		public void setVerify(boolean verify) {
			this.verify = verify;
		}

}
