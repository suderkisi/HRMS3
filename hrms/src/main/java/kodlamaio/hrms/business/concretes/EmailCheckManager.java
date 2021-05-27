package kodlamaio.hrms.business.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.EmailCheckService;
import kodlamaio.hrms.entities.concretes.Users;


@Service
public class EmailCheckManager implements EmailCheckService {


		@Override
		public boolean verifyEmail(Users users) {
			String regex =  "^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(users.getEmail());
		
			if(matcher.find()) {
		         System.out.println("Geçerli e-posta.");
		         return true;
		      } else {
		         System.out.println("Geçersiz e-posta.");
		         return false;  
		         }
			
		}
		

		
		
}