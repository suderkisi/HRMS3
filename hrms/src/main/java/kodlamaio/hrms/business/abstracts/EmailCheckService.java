package kodlamaio.hrms.business.abstracts;

import kodlamaio.hrms.entities.concretes.Users;

public interface EmailCheckService {
	
	boolean verifyEmail(Users users);

}
