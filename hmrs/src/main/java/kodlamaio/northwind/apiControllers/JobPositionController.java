package kodlamaio.northwind.apiControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.northwind.business.abstracts.JobPositionService;
import kodlamaio.northwind.entities.concretes.JobPosition;
 @RestController
 @RequestMapping("/api/jobpositions")
public class JobPositionController {
	 private JobPositionService jobPositionService;
	 @Autowired
	public JobPositionController(JobPositionService jobPositionService) {
	
		this.jobPositionService = jobPositionService;
	}
	
	@GetMapping("/getAll")
	List<JobPosition> getAll(){
		return this.jobPositionService.getAll();
	}

	}
	

