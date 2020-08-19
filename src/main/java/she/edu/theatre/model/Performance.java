package she.edu.theatre.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Objects;


@Document
public class Performance {
@Id
private String id;
private String name;
private String description;
private String yearOfOrigin;
private int budget;
private LocalDateTime createdAt;
private LocalDateTime modifaidet;

//constr


    public Performance(String id, String name, String description,
                       String yearOfOrigin, int budget, LocalDateTime createdAt,
                       LocalDateTime modifaidet) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.yearOfOrigin = yearOfOrigin;
        this.budget = budget;
        this.createdAt = createdAt;
        this.modifaidet = modifaidet;
    }

    public Performance() {
    }

    public Performance(int budget) {
        this.budget = budget;
    }

    public Performance(String yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }

    //empt constr
    public Performance(String gamlet, String shekspir, String s, int i){

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getYearOfOrigin() {
        return yearOfOrigin;
    }

    public void setYearOfOrigin(String yearOfOrigin) {
        this.yearOfOrigin = yearOfOrigin;
    }

    public int getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
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
        return "Performance{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", yearOfOrigin='" + yearOfOrigin + '\'' +
                ", budget=" + budget +
                ", createdAt=" + createdAt +
                ", modifaidet=" + modifaidet +
                '}';
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Performance that = (Performance) o;
        return getBudget() == that.getBudget() &&
                getId().equals(that.getId()) &&
                getName().equals(that.getName()) &&
                getDescription().equals(that.getDescription()) &&
                getYearOfOrigin().equals(that.getYearOfOrigin()) &&
                getCreatedAt().equals(that.getCreatedAt()) &&
                getModifaidet().equals(that.getModifaidet());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getYearOfOrigin(),
                getBudget(), getCreatedAt(), getModifaidet());
    }
}
