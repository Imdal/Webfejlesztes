package com.example.project;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "animals")
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

    public Long getAnimalId() { return id; }
    public void setAnimalId(Long id) { this.id=id; }
    public String getAnimalName() {
        return name;
    }
    public void setAnimalName(String name) {
        this.name = name;
    }
    public String getAnimalColor() {
        return color;
    }
    public void setAnimalColor(String color) {
        this.color = color;
    }
    public String getAnimalPattern() {
        return pattern;
    }
    public void setAnimalPattern(String pattern) {
        this.pattern = pattern;
    }


    public Animals(String name, String color, String pattern) {
        this.name = name;
        this.color = color;
        this.pattern = pattern;
    }

    public Animals() {

    }
}
