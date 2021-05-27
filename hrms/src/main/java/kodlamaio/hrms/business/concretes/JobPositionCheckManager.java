package kodlamaio.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kodlamaio.hrms.business.abstracts.JobPositionCheckService;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

public class JobPositionCheckManager implements JobPositionCheckService{
	
	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionCheckManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao=jobPositionDao;
	}

	@Override
	public Result JobPositionControl(JobPosition jobPosition) {
		if(jobPositionDao.existsTitleByTitle(jobPosition.getTitle())==true) {
			return new ErrorResult("İş pozisyonu mevcut olduğu için eklenemez.");
		} else {
			this.jobPositionDao.save(jobPosition);
		return new SuccessResult("İş pozisyonu başarıyla eklendi");	
		}

		
	}

}
