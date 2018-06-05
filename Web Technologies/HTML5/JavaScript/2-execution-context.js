
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

//f1(); // f1-context <== global-context

//----------------------------------------------------

//var v=100;
//var v=200;

//-----------------------------------------------------

//var v=100;

//if(true){
  //  var v=200;
//}

//console.log(v);

//----------------------------------------------------

var arr=[100,200,300,400,500];
var name='Praveen';

//console.log(arr);

//for(var num of arr){
  //  console.log(num);
//}

//for(var num in arr){
   // console.log(arr[num]);
//}


//for(var ch of name){
   // console.log(ch);
//}


//----------------------------------------------------
/*
var emps=[
    {"id":1,"first_name":"Fons","last_name":"Arrington","email":"farrington0@disqus.com"},
    {"id":2,"first_name":"Ritchie","last_name":"Pawelek","email":"rpawelek1@goo.ne.jp"},
    {"id":3,"first_name":"Klara","last_name":"Chatenier","email":"kchatenier2@webeden.co.uk"},
    {"id":4,"first_name":"Gorden","last_name":"Whitby","email":"gwhitby3@hostgator.com"},
    {"id":5,"first_name":"Saunderson","last_name":"O'Keaveny","email":"sokeaveny4@dropbox.com"},
    {"id":6,"first_name":"Hans","last_name":"Lanchberry","email":"hlanchberry5@xing.com"},
    {"id":7,"first_name":"Edsel","last_name":"Tanby","email":"etanby6@abc.net.au"},
    {"id":8,"first_name":"Lezley","last_name":"Mansford","email":"lmansford7@dropbox.com"},
    {"id":9,"first_name":"Brock","last_name":"Aukland","email":"baukland8@cocolog-nifty.com"},
    {"id":10,"first_name":"Lela","last_name":"Flaverty","email":"lflaverty9@china.com.cn"},
    {"id":11,"first_name":"Maggi","last_name":"todor","email":"mtodora@discuz.net"},
    {"id":12,"first_name":"Marcile","last_name":"O'Hederscoll","email":"mohederscollb@zdnet.com"},
    {"id":13,"first_name":"Wynny","last_name":"Blatchford","email":"wblatchfordc@independent.co.uk"},
    {"id":14,"first_name":"Brand","last_name":"Topp","email":"btoppd@whitehouse.gov"},
    {"id":15,"first_name":"Bastian","last_name":"Turfes","email":"bturfese@google.cn"},
    {"id":16,"first_name":"Gail","last_name":"Ruddick","email":"gruddickf@harvard.edu"},
    {"id":17,"first_name":"Stewart","last_name":"Buttler","email":"sbuttlerg@cdc.gov"},
    {"id":18,"first_name":"Rudolph","last_name":"McDuff","email":"rmcduffh@ifeng.com"},
    {"id":19,"first_name":"Ransom","last_name":"Berka","email":"rberkai@timesonline.co.uk"},
    {"id":20,"first_name":"Ulberto","last_name":"Kubu","email":"ukubuj@opera.com"},
    {"id":21,"first_name":"Darwin","last_name":"Yerrington","email":"dyerringtonk@google.fr"},
    {"id":22,"first_name":"Dennet","last_name":"Miliffe","email":"dmiliffel@exblog.jp"},
    {"id":23,"first_name":"Berna","last_name":"Kops","email":"bkopsm@businessweek.com"},
    {"id":24,"first_name":"Glyn","last_name":"Oxborrow","email":"goxborrown@pagesperso-orange.fr"},
    {"id":25,"first_name":"Paule","last_name":"Mimmack","email":"pmimmacko@sphinn.com"},
    {"id":26,"first_name":"Felike","last_name":"Swyn","email":"fswynp@oakley.com"},
    {"id":27,"first_name":"Carola","last_name":"Rookledge","email":"crookledgeq@earthlink.net"},
    {"id":28,"first_name":"Ruperto","last_name":"O' Finan","email":"rofinanr@sakura.ne.jp"},
    {"id":29,"first_name":"Kip","last_name":"Barkus","email":"kbarkuss@usatoday.com"},
    {"id":30,"first_name":"Marty","last_name":"Cressar","email":"mcressart@toplist.cz"},
    {"id":31,"first_name":"Baird","last_name":"Brotherhead","email":"bbrotherheadu@parallels.com"},
    {"id":32,"first_name":"Janel","last_name":"Gabey","email":"jgabeyv@wikimedia.org"},
    {"id":33,"first_name":"Rebeca","last_name":"Pimerick","email":"rpimerickw@squarespace.com"},
    {"id":34,"first_name":"Arliene","last_name":"Quaife","email":"aquaifex@google.com.br"},
    {"id":35,"first_name":"Mendie","last_name":"Meachan","email":"mmeachany@jalbum.net"},
    {"id":36,"first_name":"Genny","last_name":"Bentote","email":"gbentotez@mapquest.com"},
    {"id":37,"first_name":"Roseanna","last_name":"Jurek","email":"rjurek10@sciencedirect.com"},
    {"id":38,"first_name":"Mar","last_name":"De Lisle","email":"mdelisle11@g.co"},
    {"id":39,"first_name":"Brittney","last_name":"Larcombe","email":"blarcombe12@stumbleupon.com"},
    {"id":40,"first_name":"Leisha","last_name":"Tregent","email":"ltregent13@umich.edu"},
    {"id":41,"first_name":"Ewell","last_name":"McGucken","email":"emcgucken14@marketwatch.com"},
    {"id":42,"first_name":"Elena","last_name":"Anger","email":"eanger15@biglobe.ne.jp"},
    {"id":43,"first_name":"Windham","last_name":"Wadesworth","email":"wwadesworth16@google.cn"},
    {"id":44,"first_name":"Randolf","last_name":"Jeckells","email":"rjeckells17@moonfruit.com"},
    {"id":45,"first_name":"Amerigo","last_name":"Bodley","email":"abodley18@pinterest.com"},
    {"id":46,"first_name":"Ashlin","last_name":"Balls","email":"aballs19@imageshack.us"},
    {"id":47,"first_name":"Rowe","last_name":"Letherbury","email":"rletherbury1a@tuttocitta.it"},
    {"id":48,"first_name":"Rosalie","last_name":"Groneway","email":"rgroneway1b@oaic.gov.au"},
    {"id":49,"first_name":"Brian","last_name":"Querree","email":"bquerree1c@nps.gov"},
    {"id":50,"first_name":"George","last_name":"Sheridan","email":"gsheridan1d@networksolutions.com"}
    ]


    for(var emp of emps){
        console.log(emp.id);
        console.log(emp.first_name);
    }

*/

//---------------------------------------------------------------------------

/*
Problems with var keyword
---------------------------

*/
//var x=100;
//var x=200;

//console.log(x);
//var x=200;

//{
   // var x=200;
//}

//console.log(x);

// let keyword ==> ES-6

//let x=100;
//let x=200;


//console.log(x);
//let x=200;

//let x=100;
//{
  //  let x=200;
//}
//console.log(x);

//-----------------------------------------------------------------------------



