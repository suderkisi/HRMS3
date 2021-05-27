package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Employers")
public class Employers  {
	
	@Id
	@GeneratedValue

	@Column(name="id")
	private int id;
	
	@Column(name="Company_name")
	private String companyName;
	
	@Column(name="Company_website")
	private String companyWebSite;
	
	@Column(name="phone_number")
	private String phoneNumber;
	
	@Column(name="email")
	private String email;
	
	@Column(name="verify")
	private boolean verify;
	
	public Employers() {}

	public Employers(int id,String companyName, String companyWebSite, String phoneNumber,String email, boolean verify) {
		super();
		this.id=id;
		this.companyName = companyName;
		this.companyWebSite = companyWebSite;
		this.phoneNumber = phoneNumber;
		this.email=email;
		this.verify = verify;
	}

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyWebSite() {
		return companyWebSite;
	}

	public void setCompanyWebSite(String companyWebSite) {
		this.companyWebSite = companyWebSite;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isVerify() {
		return verify;
	}

	public void setVerify(boolean verify) {
		this.verify = verify;
	}
	

}
