package she.edu.theatre.service.performance.impls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Service;
import she.edu.theatre.datastorage.DataFake;
import she.edu.theatre.model.Performance;
import she.edu.theatre.repository.PerformanceReporitory;
import she.edu.theatre.service.performance.interfaces.IPerformanceService;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
@Service
public class PerformanceServiceImpl implements IPerformanceService {
    @Autowired
    DataFake dataFake;
    @Autowired
    PerformanceReporitory performanceReporitory;
   @PostConstruct              //з fake витягуєм v mongo
    void init(){
        List<Performance> list= dataFake.getPerformances();
        performanceReporitory.saveAll(list);
    }


    @Override
    public Performance create(Performance performance) {
        performance.setCreatedAt(LocalDateTime.now());

        return null;
    }

    @Override
    public Performance get(String id) {

        return performanceReporitory.findById(id).orElse(null);
    }


    @Override
    public Performance update(Performance performance) {
        performance.setModifaidet(LocalDateTime.now());
        return performanceReporitory.save(performance);

    }

    @Override
    public Performance delete(String id) {
        return null;
    }

    @Override
    public List<Performance> getAll() {
        return performanceReporitory.findAll();
    }
}
