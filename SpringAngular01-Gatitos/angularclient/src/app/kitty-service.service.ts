import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Kitty } from './kitty';
import { Observable } from 'rxjs';

@Injectable()
export class KittyServiceService {

  private kittysUrl: string;
 
  constructor(private http: HttpClient) {
    this.kittysUrl = 'http://localhost:8080/rest/';
  }
 
  public findAll(): Observable<Kitty[]> {
    return this.http.get<Kitty[]>(this.kittysUrl);
  }
 
  public save(kitty: Kitty) {
    return this.http.post<Kitty>(this.kittysUrl, kitty);
  }
}
