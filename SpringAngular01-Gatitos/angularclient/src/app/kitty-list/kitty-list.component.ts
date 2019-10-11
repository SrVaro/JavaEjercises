import { Component, OnInit } from '@angular/core';
import { Kitty } from '../kitty';
import { KittyServiceService } from '../kitty-service.service';
@Component({
  selector: 'app-kitty-list',
  templateUrl: './kitty-list.component.html',
  styleUrls: ['./kitty-list.component.css']
})
export class KittyListComponent implements OnInit {

  kittys: Kitty[];
 
  constructor(private kittyService: KittyServiceService) {
  }
 
  ngOnInit() {
    this.kittyService.findAll().subscribe(data => {
      this.kittys = data;
    });
  }

}
