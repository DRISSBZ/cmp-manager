package fr.dbiaz.cmpmanager.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployeeEntitY {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firsname;
    private String lastname;
    private String Age;
    private String adress;

}
