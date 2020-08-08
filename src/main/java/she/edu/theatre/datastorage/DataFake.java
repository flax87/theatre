package she.edu.theatre.datastorage;

import org.springframework.stereotype.Component;
import she.edu.theatre.model.Performance;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class DataFake {



    private List<Performance> performances = new LinkedList<>(
            Arrays.asList(
                    new Performance("Gamlet","Shekspir",20,40),
                    new Performance("Romeo","Taras",20,50),
                    new Performance("Madagaskar","Petro",20,40)

            )
    );
//get set
    public List<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }
}
