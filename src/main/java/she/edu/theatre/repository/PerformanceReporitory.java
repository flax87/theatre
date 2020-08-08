package she.edu.theatre.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import she.edu.theatre.model.Performance;

@Repository
public interface PerformanceReporitory extends MongoRepository<Performance,String> {


}
