import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {

  constructor() { }

  @Input()
  message:string;

  @Output()
  out=new EventEmitter();

  greet(){
    this.message='Good Evening';
    this.out.emit('Good Evening');
  }

  ngOnInit() {
  }

}
