import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  name='Praveen';
  showData=true;
  countries=['India','US','UK','Canada','China','Japan'];
  age=98;
  addr='Hyderabad';
  imagePath="https://image.shutterstock.com/image-vector/red-rose-logo-vector-illustration-260nw-588621497.jpg";

  myFun(){
    console.log('--- Address..'+this.addr);
  }

}
