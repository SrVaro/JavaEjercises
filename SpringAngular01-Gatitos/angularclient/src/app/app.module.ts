import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { KittyListComponent } from './kitty-list/kitty-list.component';
import { UserFormComponent } from './user-form/user-form.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { KittyServiceService } from './kitty-service.service';

@NgModule({
  declarations: [
    AppComponent,
    KittyListComponent,
    UserFormComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [KittyServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
