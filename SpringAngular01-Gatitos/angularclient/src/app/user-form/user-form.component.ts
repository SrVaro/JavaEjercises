import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { KittyServiceService } from '../kitty-service.service';
import { Kitty } from '../kitty';

@Component({
  selector: 'app-user-form',
  templateUrl: './user-form.component.html',
  styleUrls: ['./user-form.component.css']
})
export class UserFormComponent {

  kitty: Kitty;
 
  constructor(private route: ActivatedRoute, private router: Router, private kittyService: KittyServiceService) {
    this.kitty = new Kitty();
  }
 
  onSubmit() {
    this.kittyService.save(this.kitty).subscribe(result => this.gotoKittyList());
  }
 
  gotoKittyList() {
    this.router.navigate(['/kittys']);
  }
}
