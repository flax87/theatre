package she.edu.theatre.service.performance.interfaces;

import she.edu.theatre.model.Performance;

import java.util.List;

public interface IPerformanceService {

    Performance create (Performance performance);
    Performance get(String id);
    Performance update (Performance performance);
    Performance delete (String id);
    List<Performance> getAll();
}
