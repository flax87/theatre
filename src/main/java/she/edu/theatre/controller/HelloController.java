package she.edu.theatre.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    String seyHello(){
        return "<h1>Hello front controller</h1>";
    }

}
