package she.edu.theatre.datastorage;

import org.springframework.stereotype.Component;
import she.edu.theatre.model.Actor;
import she.edu.theatre.model.CashRegister;
import she.edu.theatre.model.EmploymentOfActors;
import she.edu.theatre.model.Performance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Component
public class DataFake {


//Performance List
    private List<Performance> performances = new LinkedList<>(
            Arrays.asList(
                    new Performance("Gamlet","Shekspir","20.07.21",40),
                    new Performance("Romeo","Taras","21.07.21",50),
                    new Performance("Madagaskar","Petro","30.08.21",40)

            )
    );
//Actor List
    private List<Actor> actors = new ArrayList<>(
          Arrays.asList(
                  new Actor("Alla", "Pugacheva" ," Ivanovna","High", 70,500000),
                  new Actor("Ivo", "Bobul" ," Gavrilovich","High", 20,500000)
          )
    );
//EmploymentOfActors List
    private List<EmploymentOfActors> employmentOfActors = new ArrayList<>(
            Arrays.asList(
                    new EmploymentOfActors(actors.get(0),"Penokio",15000),
                    new EmploymentOfActors(actors.get(0),"Pikasso",12000),
                    new EmploymentOfActors(actors.get(0),"Albert",12000)
            )
    );
//CashRegister List
    private  List<CashRegister> cashRegisters = new ArrayList<>(
            Arrays.asList(
                    new CashRegister("lol",12, 15, 30, 50)
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
