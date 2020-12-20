package com.example.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;


@SpringBootApplication
@EnableJpaRepositories("es.uc3m.tiw.dominios")
public class ProjectApplication{

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
		AnimalService animalService= new AnimalServiceImpl();
		Animals animals = new Animals("Molly","Brown","None");
		animalService.saveAnimal(animals);
	}

}
