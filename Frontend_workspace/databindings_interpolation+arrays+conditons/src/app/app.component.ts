import { Component } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

 
export class AppComponent {  

  num:number=0;  // declaration of variable
  title="ram is good boy";
  Movies: any[] = [
                      {
                        "name": "Avengers: Endgame"
                      },
                      {
                        "name": "Good Boys"
                      },
                      {

                        "tname":"movies"
                      }
                 ];

}









