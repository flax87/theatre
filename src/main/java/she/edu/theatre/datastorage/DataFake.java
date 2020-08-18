package she.edu.theatre.datastorage;

import org.springframework.stereotype.Component;
import she.edu.theatre.model.Actor;
import she.edu.theatre.model.EmploymentOfActors;
import she.edu.theatre.model.Performance;

import java.util.ArrayList;
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

    private List<Actor> actors = new ArrayList<>(
          Arrays.asList(
                  new Actor("Alla", "Pugacheva" ," Ivanovna","High", 70,500000),
                  new Actor("Ivo", "Bobul" ," Gavrilovich","High", 30,500000)
          )
    );

    private List<EmploymentOfActors> employmentOfActors = new ArrayList<>(
            Arrays.asList(
                    new EmploymentOfActors()
            )
    );

//get set Performance
    public List<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }
 //get set Actors

    public List<Actor> getActors() {
        return actors;
    }
    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

 //get set EmploymentOfActors

}
