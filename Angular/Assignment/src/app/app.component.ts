import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  geetMsg:string;

  dislayMessage(msg){
    this.geetMsg=msg;
  }

}
