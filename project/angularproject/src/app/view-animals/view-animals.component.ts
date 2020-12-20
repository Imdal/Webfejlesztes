// import { Component, OnInit } from '@angular/core';
//
// @Component({
//   selector: 'app-view-animals',
//   templateUrl: './view-animals.component.html',
//   styleUrls: ['./view-animals.component.css']
// })
// export class ViewAnimalsComponent implements OnInit {
//
//   constructor() { }
//
//   ngOnInit(): void {
//   }
//
// }

import { Component, OnInit } from '@angular/core';
import { AnimalService } from '../animal.service';
import { Animals } from '../animal';
import { Observable,Subject } from "rxjs";

import {FormControl,FormGroup,Validators} from '@angular/forms';

@Component({
  selector: 'app-view-animals',
  templateUrl: './view-animals.component.html',
  styleUrls: ['./view-animals.component.css']
})
export class ViewAnimalsComponent implements OnInit {

  constructor(private animalService:AnimalService) { }

  animalsArray: any[] = [];
  dtOptions: DataTables.Settings = {};
  dtTrigger: Subject<any>= new Subject();


  animals: Observable<Animals[]>;
  animal : Animals=new Animals();
  deleteMessage=false;
  animallist:any;
  isupdated = false;


  ngOnInit() {
    this.isupdated=false;
    this.dtOptions = {
      pageLength: 6,
      stateSave:true,
      lengthMenu:[[6, 16, 20, -1], [6, 16, 20, "All"]],
      processing: true
    };
    this.animalService.allAnimals().subscribe(data =>{
      this.animals =data;
      this.dtTrigger.next();
    })
  }

  deleteAnimal(id: number) {
    this.animalService.deleteAnimal(id)
      .subscribe(
        data => {
          console.log(data);
          this.deleteMessage=true;
          this.animalService.allAnimals().subscribe(data =>{
            this.animals =data
          })
        },
        error => console.log(error));
  }


  updateAnimal(id: number){
    this.animalService.getAnimalsByID(id)
      .subscribe(
        data => {
          this.animallist=data
        },
        error => console.log(error));
  }

  animalupdateform=new FormGroup({
    id:new FormControl(),
    name:new FormControl(),
    color:new FormControl(),
    pattern:new FormControl()
  });

  updateAni(){
    this.animal=new Animals();
    this.animal.id=this.AnimalId?.value;
    this.animal.name=this.AnimalName?.value;
    this.animal.color=this.AnimalColor?.value;
    this.animal.pattern=this.AnimalPattern?.value;


    this.animalService.updateAnimal(this.animal.id,this.animal).subscribe(
      data => {
        this.isupdated=true;
        this.animalService.allAnimals().subscribe(data =>{
          this.animals =data
        })
      },
      error => console.log(error));
  }

  get AnimalName(){
    return this.animalupdateform.get('name');
  }

  get AnimalColor(){
    return this.animalupdateform.get('color');
  }

  get AnimalPattern(){
    return this.animalupdateform.get('pattern');
  }

  get AnimalId(){
    return this.animalupdateform.get('id');
  }

  changeisUpdate(){
    this.isupdated=false;
  }
}
