package kodlamaio.northwind.business.abstracts;

import java.util.List;

import kodlamaio.northwind.entities.concretes.JobPosition;

public interface JobPositionService {
 List<JobPosition> getAll();
}
