package com.example.project;

import java.util.List;

public interface AnimalService {

    public boolean saveAnimal(Animals animal);
    public boolean deleteAnimal(Animals animal);
    public  boolean updateAnimal(Animals animal);
    public List<Animals> getAnimals();
    public List<Animals> getAnimalById(Long id);
    public List<Animals> getAnimalByName(String name);
}
