package com.example.H2Mock;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "students")
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String lastname;
    @Column(nullable = false)
    private String fisrtname;
    @Column(unique = true, nullable = false)
    private String email;

}
