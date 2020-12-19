package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

//@Controller("animalController")
//public class AnimalController {
//    @Autowired
//    private AnimalService animalService;
//
//    public List<AnimalUITO> getAnimalUiToList() {
//        return  animalUiToList;
//    }
//    public void setAnimalUiToList(List<AnimalUITO> animalUiToList) {
//        this.animalUiToList = animalUiToList;
//    }
//
//    @PostConstruct
//    public void getAllAnimal() {
//        animalUiToList = new ArrayList<>();
//        if (!this.getAnimalUiToList().isEmpty()) {
//            this.getAnimalUiToList().clear();
//        }
//        this.getAnimalUiToList().addAll(animalService.getAllAnimals());
//    }
//
//}

//@RestController
//@CrossOrigin
//@RequestMapping()
//public class AnimalController {
//
//    @Autowired
//    private AnimalService animalService;
//
//    @PostMapping("saveAnimal")
//    public boolean saveAnimal(@RequestBody Animals animals) {
//        return animalService.saveAnimal(animals);
//    }
//}