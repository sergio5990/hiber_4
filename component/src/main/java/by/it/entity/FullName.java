package by.it.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@NoArgsConstructor @AllArgsConstructor
@Embeddable
public class FullName {
    private String firstName;
    private String lastName;
}
