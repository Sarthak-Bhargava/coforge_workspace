import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  public todayDate: Date = new Date();
  public amount: number = 4582;
  public message: string="Learning";
     
}
