import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class AnimalService {

  private baseUrl = 'http://localhost:8080/api/';

  constructor(private http:HttpClient) { }

  allAnimals(): Observable<any> {
    return this.http.get(`${this.baseUrl}`+'getAllAnimals');
  }

  saveAnimal(student: object): Observable<object> {
    return this.http.post(`${this.baseUrl}`+'saveAnimal', student);
  }

  deleteAnimal(id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/deleteAnimal/${id}`, { responseType: 'text' });
  }

  getAnimalsByID(id: number): Observable<Object> {
    return this.http.get(`${this.baseUrl}/getAnimalById/${id}`);
  }

  getAnimalsByName(name: string): Observable<Object> {
    return this.http.get(`${this.baseUrl}/getAnimalByName/${name}`);
  }

  updateAnimal(id: number, value: any): Observable<Object> {
    return this.http.post(`${this.baseUrl}/updateAnimal/{id}`, value);
  }

}
