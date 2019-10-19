package by.it.entity;
import lombok.*;

import javax.persistence.*;
@Data
@NoArgsConstructor @AllArgsConstructor

@Entity
@Table(name = "PERSON")
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "PERSON_TYPE",
        discriminatorType = DiscriminatorType.CHAR)
@DiscriminatorValue("P")
public class Person {
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private int age;
    @Column
    private String name;
    @Column
    private String surname;
}


