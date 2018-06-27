import { Component, OnInit, Input, EventEmitter, Output } from '@angular/core';

@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {

  constructor() { }
  @Input()
  msg:string;

  @Output()
  out=new EventEmitter();

  testFun(){
    this.out.emit('--- Message from Child Component');
  }

  ngOnInit() {
  }

}
