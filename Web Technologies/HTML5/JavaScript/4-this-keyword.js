/*
    this ==> current context's owner
*/


// why do we need this keywotd?
/*
let pName='Global';
let person={
   pName:'Praveen',
    sayName:function(){
       // let pName='Local';
        console.log('im '+pName); // context's hierarchy data
        console.log('im '+person.pName); // object's data
        console.log('im '+this.pName); // current context's owener data
    }
};

person.sayName();
//let p=person;
 //p.sayName();

*/

// -------------------------------------------------------------------------------------

/*
function-binding
--------------------
    1. static
    2. dynamic

*/

//-----------------------------------------------------------------------------------------

// 1. static-function-binding

let p1={name:'Praveen',sayName:function(){ console.log('i am '+this.name)}}
let p2={name:'Ozvitha',sayName:function(){console.log('i am '+this.name)}}


//p1.sayName(); ==> Praveen
//p2.sayName(); ==> Ozvitha

function sayNameForAll(){
   // console.dir(this);
   //console.log(' I am '+this.name);
}
//sayNameForAll();

//--------------------------------------------------------------------------------

//2. dynamic - function-binding

let greetLib={
    name:'greet-lib',
    sayName:function(message,from){
        console.log(message+' I am '+this.name+"  and i am from  "+from);
    }
};

//greetLib.sayName('Hi','Bangalore');
let p={name:'Praveen'};
let e={name:'James'};

// Way - 1

//greetLib.sayName.call(p,"Hello","Chennai");
//greetLib.sayName.call(e,"Hey","Bangalore");

// way - 2

//greetLib.sayName.apply(p,["Hi","Chennai"]);
//greetLib.sayName.apply(e,["Hey","Goa"]);

// way - 3

let sayNameFuncOnPerson= greetLib.sayName.bind(p,"Hello","Chennai");
let sayNameFuncOnEmployee= greetLib.sayName.bind(e,"Good Morning","Pune");

sayNameFuncOnPerson();
sayNameFuncOnEmployee();

//---------------------------------------------------------------------------------------