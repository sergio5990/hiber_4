package by.it.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long id;
    @Embedded
    private FullName fullName;
    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name = "firstName", column = @Column(name = "firstName2")),
            @AttributeOverride(name = "lastName", column = @Column(name = "lastName2")),
    })
    private FullName fullName2;
    private String company;
    private Double salary;
}

