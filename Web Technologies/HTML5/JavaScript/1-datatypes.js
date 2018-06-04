
/*
.js - data-types
------------------
1. simple/primitive  ==> values
    a. string
    b. number
    c. boolean
    d. undefined

2. complex/reference ==> objects

*/

//--------------------------------------------------
// 1. Simple/Primitive data types
//--------------------------------------------------

// a. string

var name="Praveen";
var selection ='abc';

var dynamicString='The value is '+(2+2);
var multiLineString="Hello How are you"+
                    "I am good"

   //  from Es6  ==> string iterpolation
   var dynamicString =`the value is ${20+2}`

   var multiLineString= `
   
    <div>
        <h1> ${10+10} </h1>
     </div>   
   
      `
// -----------------------------------------------------------

// b. number
var count=12;
var cost=12.87;

//-----------------------------------------------------------

// c. boolean

 var found=false;
 


/*
 // Imp note : falsy values in .js language

    ==> false, 0 ,"" , null , undefined , NAN
    
 */

 //-------------------------------------------------------------

 // d. undefined

 var v;

 //-------------------------------------------------------------

// 2. reference / Complex- type => Objects

//---------------------------------------------------

// How to create object in js?

/*
var ref=new Constuctor();

imp Note: 

by default, all java script objects are extensible and confugurable

JSON: Java Script Object Notation

*/

var config=new Object();

config.url='http://www.abc.com';
config.method='POST';
config.addr='http://xyz.com';
config.m1=function(){
    console.log(' now i am part of config obj');
}



var emp=new Object();
emp.empName='Praveen';
emp.empId=1024;
emp.salary=934739;
/*
var msg=function test(){
 //   console.log('--- a test function');
    return 'Praveen is really very good';
}
*/
/*
var msg=function(){
    return 'Ozvitha also good girl';
}
*/

//-------------------------------------

// JSON format object 

//--------------------------------------

// Literal style
var person={
pname:'Praveen',
age:'21',
city:'Chennai'
}

delete person.pname;


person.addr='Hyderabad';

person.desig='Trainer'


var prods=[
{pid:10,pname:'Pen',price:76},
{pid:11,pname:'Book',price:34},
{pid:12,pname:'Mac',price:32},
{pid:14,pname:'Ball',price:23}
];

// b. Arrays

var menu=new Array();
menu[0]='Hyderabad Special Biryani';
menu[1]='Chennai Idle';
menu[2]=10000;

// or

var newmenu=['Idle','Wada',10000,'Puri'];
newmenu.push('Dosa')
newmenu.push('Sambar');

newmenu.pop();
newmenu.pop();
newmenu.pop();









































   










