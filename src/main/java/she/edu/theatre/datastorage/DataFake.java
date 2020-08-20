package she.edu.theatre.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import she.edu.theatre.model.Actor;
import she.edu.theatre.model.CashRegister;
import she.edu.theatre.model.EmploymentOfActors;
import she.edu.theatre.model.Performance;
import she.edu.theatre.repository.ActorRepository;
import she.edu.theatre.repository.EmploymentOfActorsRepository;
import she.edu.theatre.repository.PerformanceReporitory;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class DataFake {
    @Autowired
    PerformanceReporitory performanceReporitory;

    @Autowired
    ActorRepository actorRepository;
    @Autowired
    EmploymentOfActorsRepository employmentOfActorsRepository;

//Performance List
    private List<Performance> performances = new LinkedList<>(
            Arrays.asList(
                    new Performance(
                            "Partisan",
                            "Reunited by their father's death, " +
                            "estranged siblings with extraordinary powers " +
                            "uncover shocking family secrets -- and a looming threat to humanity.",
                            "20.07.21",
                            400000000),
                    new Performance(
                            "Godzilla",
                            "The true story of Colombia's infamously violent" +
                                    " and powerful drug cartels fuels this gritty gangster drama series",
                            "21.07.21",
                            500000000),
                    new Performance(
                            "Tesla",
                            "This surreal animated anthology series follows three" +
                            " generations of families who inhabit the same " +
                            "otherworldly house.",
                            "30.08.21",
                            700000000)

            )
    );
//Actor List
    private List<Actor> actors = new ArrayList<>(
          Arrays.asList(
                  new Actor("Johny", "Depp" ,"Ivanovich","High", 50,500000),
                  new Actor("Ivo", "Bobul" ," Gavrilovich","High", 56,6700000),
                  new Actor("Al", "Pacino" ," Gavrilovich","High", 70,1200000),
                  new Actor("Russel", "Crov" ," Oleksandrovich","High", 45,1200000)
          )
    );
//EmploymentOfActors List
    private List<EmploymentOfActors> employmentOfActors = new ArrayList<>(
            Arrays.asList(
                    new EmploymentOfActors(actors.get(0),"Beast",15000),
                    new EmploymentOfActors(actors.get(0),"Pikasso",12000),
                    new EmploymentOfActors(actors.get(0),"Albert Einstein",13000),
                    new EmploymentOfActors(actors.get(0),"Agent 007",18000)
            )
    );
//CashRegister List
    private  List<CashRegister> cashRegisters = new ArrayList<>(
            Arrays.asList(
                    new CashRegister("lol",12, 15, 30, 50)
            )
    );

    @PostConstruct
    void init(){ //з fake витягуєм v mongo
        performanceReporitory.deleteAll();
        performanceReporitory.saveAll(performances);

        actorRepository.saveAll(actors);

        employmentOfActorsRepository.saveAll(employmentOfActors);
    }

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
    public List<EmploymentOfActors> getEmploymentOfActors() {
        return employmentOfActors;
    }
    public void setEmploymentOfActors(List<EmploymentOfActors> employmentOfActors) {
        this.employmentOfActors = employmentOfActors;
    }

 //get set CashRegister
    public List<CashRegister> getCashRegisters() {
        return cashRegisters;
    }
    public void setCashRegisters(List<CashRegister> cashRegisters) {
        this.cashRegisters = cashRegisters;
    }
}
