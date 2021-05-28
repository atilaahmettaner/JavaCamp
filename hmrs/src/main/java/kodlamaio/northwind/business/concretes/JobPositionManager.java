package kodlamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.northwind.business.abstracts.JobPositionService;
import kodlamaio.northwind.dataAccess.abstracts.JobPositionDao;
import kodlamaio.northwind.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService {
	private JobPositionDao jobPositionDao;
@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

		
		
	@Override
	public List<JobPosition> getAll() {
		// TODO Auto-generated method stub
		
		return this.jobPositionDao.findAll();
	}
	
	
	

}
