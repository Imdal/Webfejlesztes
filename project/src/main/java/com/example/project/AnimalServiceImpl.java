package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AnimalServiceImpl implements AnimalService{
    @Autowired
    private AnimalDao animalDao;

    @Override
    public boolean saveAnimal(Animals animal) {
        return animalDao.saveAnimal(animal);
    }

    @Override
    public boolean deleteAnimal(Animals animal) {
        return animalDao.deleteAnimal(animal);
    }

    @Override
    public boolean updateAnimal(Animals animal) {
        return animalDao.updateAnimal(animal);
    }

    @Override
    public List<Animals> getAnimals() {
        return animalDao.getAnimals();
    }

    @Override
    public List<Animals> getAnimalById(Long id) {
        return animalDao.getAnimalById(id);
    }

    @Override
    public List<Animals> getAnimalByName(String name) {
        return animalDao.getAnimalByName(name);
    }
}
