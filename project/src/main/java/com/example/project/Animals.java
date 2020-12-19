package com.example.project;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Animals")
public class Animals implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;
    @Column
    private String name;
    @Column
    private String color;
    @Column
    private String pattern;

    public Animals(String name, String color, String pattern) {
        this.name = name;
        this.color = color;
        this.pattern = pattern;
    }

    public Animals() {

    }
}
