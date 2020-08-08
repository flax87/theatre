package she.edu.theatre.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import she.edu.theatre.datastorage.DataFake;
import she.edu.theatre.model.Performance;
import she.edu.theatre.service.performance.impls.PerformanceServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/api/performance")
public class PerformanceController {


   @Autowired
    PerformanceServiceImpl performanceService;

        @RequestMapping("/get/list")
        List<Performance> showAll(){
            return performanceService.getAll();
}



}
