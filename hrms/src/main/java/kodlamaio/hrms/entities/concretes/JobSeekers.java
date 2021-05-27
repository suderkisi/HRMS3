package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Job_seekers")
public class JobSeekers {
	
	
	@Id
	@GeneratedValue

	@Column(name="id")
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="nationality_Id")
	private String nationalityId;
	
	@Column(name="birthday")
	private String yearOfBirth;
	
	@Column(name="verify")
	private boolean verify;
	
	
	public JobSeekers() {}
	
	public JobSeekers(int id,String name, String lastName, String nationalityId, String yearOfBirth, boolean verify) {
		super();
		this.id=id;
		this.name = name;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.yearOfBirth = yearOfBirth;
		this.verify = verify;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}


	public String getYearOfBirth() {
		return yearOfBirth;
	}


	public void setYearOfBirth(String yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}


	public boolean isVerify() {
		return verify;
	}


	public void setVerify(boolean verify) {
		this.verify = verify;
	} 

}
