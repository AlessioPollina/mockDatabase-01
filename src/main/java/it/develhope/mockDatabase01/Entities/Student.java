package it.develhope.mockDatabase01.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "studentClass")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idStudent;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;
}
