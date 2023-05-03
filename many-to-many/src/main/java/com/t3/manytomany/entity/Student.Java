package com.t3.manytomany.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "students")
@Getter @Setter @NoArgsConstructor
public class Student {
    
    @Id
    @GeneratedValue
    private long id;

    private String firstName;

    private String lastName;

}
