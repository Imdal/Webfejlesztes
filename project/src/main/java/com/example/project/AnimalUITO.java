package com.example.project;

import javax.persistence.Column;

public class AnimalUITO {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String name;
    private String color;
    private String pattern;

    public Long getAnimalId() {
        return id;
    }

    public void setAnimalId(Long id) {
        this.id = id;
    }

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


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        AnimalUITO other = (AnimalUITO) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}
