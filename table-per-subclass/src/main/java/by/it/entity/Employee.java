package by.it.entity;

import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.Polymorphism;
import org.hibernate.annotations.PolymorphismType;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "EMPLOYEE")
@PrimaryKeyJoinColumn(name="PERSON_ID")
@Polymorphism(type = PolymorphismType.EXPLICIT)
public class Employee extends Person {
    private String company;
    private Double salary;

    public Employee(Integer id, int age, String name, String surname, String company, Double salary) {
        super(id, age, name, surname);
        this.company = company;
        this.salary = salary;
    }
}

