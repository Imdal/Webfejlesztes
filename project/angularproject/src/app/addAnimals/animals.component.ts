import { Component, OnInit } from '@angular/core';
import { AnimalService } from '../animal.service';
import {Animals} from "../animal";
import {FormControl, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-animals',
  templateUrl: './animals.component.html',
  styleUrls: ['./animals.component.css']
})
export class AnimalsComponent implements OnInit {

  constructor(private animalService:AnimalService) {  }

  animal: Animals= new Animals();
  submitted = false;

  ngOnInit() {
    this.submitted=false;
  }

  animalsaveform=new FormGroup({
    name:new FormControl('' , [Validators.required , Validators.minLength(3) ] ),
    color:new FormControl('',[Validators.required,Validators.minLength(3)]),
    pattern:new FormControl('',[Validators.required,Validators.minLength(3)])
  });

  saveAnimal(){
    this.animal=new Animals();
    this.animal.name=this.AnimalName?.value;
    this.animal.color=this.AnimalColor?.value;
    this.animal.pattern=this.AnimalPattern?.value;
    this.submitted = true;
    this.save();
  }

  save() {
    this.animalService.saveAnimal(this.animal)
      .subscribe(data => console.log(data), error => console.log(error));
    this.animal = new Animals();
  }

  get AnimalName(){
    return this.animalsaveform.get('animalName');
  }

  get AnimalColor(){
    return this.animalsaveform.get('animalColor');
  }

  get AnimalPattern(){
    return this.animalsaveform.get('animalPattern');
  }

  addAnimalForm(){
    this.submitted=false;
    this.animalsaveform.reset();
  }

}
