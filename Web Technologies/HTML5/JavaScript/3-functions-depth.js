/*
How to make/create functions in .js language?

1. function declaration
 
    ==> named function
    ==> function object created at context-creation phase
    ==> always get hoisted with fun-object

2. function-expresion

    ==> anonymos function
    ==> function object created ar context-execution phase


*/


/*
f1();

function f1(){ // ==> function declaration
    console.log('hey i am f1 function');
}

*/



/*
var funObj=function(){
    console.log('hey I am function expresion type');
}
*/

//funObj();

//var x;
//let x;

//---------------------------------------------------------------

// 1. function declration

/*
console.log(add(100,200));

function add(n1,n2){
    return n1+n2;
}
*/

//---------------------------------------------------

// 2.function expression

/*
var add=function(n1,n2){
    return n1+n2;
}

console.log(add(100,200));
*/

// function principles

// 1 A function can be stored in a variable or value

/*
 function greet(){
     console.log('Hello Madhu');
 }

 var sayHello=greet;
 sayHello();

 */
//---------------------------------------------------

// 2. A parameter of a functin can be a function

//function add(x1,x2){
  //  console.log('Hello add');
//}

//add(100);


  var nums=[1,3,5,7,9,2,4,8,10];

  nums.sort();
  nums.sort(function(x,y){ return x-y});
  //console.log(nums);

  // 3. The return type of a function can be a function

 function teach(){
     console.log('.. teaching Java');

     let learn=function(){
         console.log('... learning Java')
     }
    // learn();
     return learn;
 }

let learn=teach();

learn();
learn();
learn();

