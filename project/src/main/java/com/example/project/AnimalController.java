package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins="http://localhost:3306")
@RequestMapping(value="/api")
public class AnimalController {

    @Autowired
    private AnimalService animalService;

    @PostMapping("saveAnimal")
    public boolean saveAnimal(@RequestBody Animals animals) {
        return animalService.saveAnimal(animals);
    }

    @GetMapping("getAllAnimals")
    public List<Animals> allAnimals() {
        return animalService.getAnimals();
    }

    @DeleteMapping("deleteAnimal/{id}")
    public boolean deleteAnimal(@PathVariable("id") Long id, Animals animals) {
        animals.setAnimalId(id);
        return animalService.deleteAnimal(animals);
    }

    @GetMapping("getAnimalById/{id}")
    public List<Animals> getAnimalsByID(@PathVariable("id") Long id,Animals animals) {
        animals.setAnimalId(id);
        return animalService.getAnimalById(id);
    }

    @GetMapping("getAnimalByName/{name}")
    public List<Animals> getAnimalsByName(@PathVariable("name") String name, Animals animals) {
        animals.setAnimalName(name);
        return animalService.getAnimalByName(name);
    }

    @PostMapping("updateAnimal/{id}")
    public boolean updateAnimal(@RequestBody Animals animals,@PathVariable("id") Long id) {
        animals.setAnimalId(id);
        return animalService.updateAnimal(animals);
    }



}