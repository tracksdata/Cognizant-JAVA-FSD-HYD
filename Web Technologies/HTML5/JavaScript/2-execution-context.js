
/*
Execution-Context / Scope
---------------------------

memory / stack-frame with given arguments  & locals to execute instructions in sequence

2 phases

phase-1: context-creation /push

    => all variables declared with 'var' keyword anywhere with in the context, will get hoisted 
       with default value (undefined)

phase-2: context-execution / pop

    => instructions will get executed in sequence.

    ----------------------------------------------------------


// => by default every .js-runtime has one global-context always
// => any context must run by an 'object'

e.g:
    -> global-context always executed by 'global-object'

    global-object:
    browser-envi    ==> window
    Node.js         ==> process
    ---

   imp note:
   every function-invocation also creates a new context which is child of in-which context
   that function has declared/created

*/
//n=100;
//var n;
//console.log('N value is '+n);
//console.log('N value is '+n);
//var name='Ozvitha';

//console.log('Name is '+name);

//-----------------------------------------------------


/*
var v=12;
function f1(){
   var v=13;
   console.log(v);
   console.log(this.v);
}
f1();
*/

// Quiz

var v=12;
function f1(){
   
    function f2(){
        console.log(v);  
    }
   
   var v;
   v=13;
   f2(); // f2-context <==f1-context
}

f1(); // f1-context <== global-context






