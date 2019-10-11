import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { KittyListComponent } from './kitty-list/kitty-list.component';
import { UserFormComponent } from './user-form/user-form.component';

const routes: Routes = [
  { path: 'kittys', component: KittyListComponent },
  { path: 'addkitty', component: UserFormComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
