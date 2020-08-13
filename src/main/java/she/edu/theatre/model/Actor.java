package she.edu.theatre.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;
@Document
public class Actor {
@Id
    private String id;
    private String name;
    private String surname;
    private String patronymic;
    private String experience;
    private int yearOfOrigin;
    private int priceAnnualContract;
    private LocalDateTime createdAt;
    private LocalDateTime modifaidet;


    //constr

    public Actor() {
    }

    public Actor(String id, String name, String surname, String patronymic,
                 String experience, int yearOfOrigin, int priceAnnualContract,
                 LocalDateTime createdAt, LocalDateTime modifaidet) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.experience = experience;
        this.yearOfOrigin = yearOfOrigin;
        this.priceAnnualContract = priceAnnualContract;
        this.createdAt = createdAt;
        this.modifaidet = modifaidet;
    }

    public Actor(String name, String surname, String patronymic, String experience, int yearOfOrigin, int priceAnnualContract) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.experience = experience;
        this.yearOfOrigin = yearOfOrigin;
        this.priceAnnualContract = priceAnnualContract;
    }
    //get set

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public int getYearOfOrigin() {
        return yearOfOrigin;
    }

    public void setYearOfOrigin(int yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }

    public int getPriceAnnualContract() {
        return priceAnnualContract;
    }

    public void setPriceAnnualContract(int priceAnnualContract) {
        this.priceAnnualContract = priceAnnualContract;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getModifaidet() {
        return modifaidet;
    }

    public void setModifaidet(LocalDateTime modifaidet) {
        this.modifaidet = modifaidet;
    }

    //string


    @Override
    public String toString() {
        return "Actor{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", experience='" + experience + '\'' +
                ", yearOfOrigin=" + yearOfOrigin +
                ", priceAnnualContract=" + priceAnnualContract +
                ", createdAt=" + createdAt +
                ", modifaidet=" + modifaidet +
                '}';
    }

    //equels

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return getYearOfOrigin() == actor.getYearOfOrigin() &&
                getPriceAnnualContract() == actor.getPriceAnnualContract() &&
                getId().equals(actor.getId()) &&
                getName().equals(actor.getName()) &&
                getSurname().equals(actor.getSurname()) &&
                getPatronymic().equals(actor.getPatronymic()) &&
                getExperience().equals(actor.getExperience());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSurname(), getPatronymic(),
                getExperience(), getYearOfOrigin(), getPriceAnnualContract());
    }
}
