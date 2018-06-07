$(document).ready(function(){

$('.card').on('click','button',function(){

    var vacation = $(this).closest('.card'); 
   // var price=$('<p>From $10000</p>');
   //var amount = $(this).closest('.card').data('price');
   var amount=vacation.data('price');
   var price = $(`
                   <p> &#8377;${amount} per ticket</p>
                   <p>Tickets: <input type='number' class='quantity' value='1'></p>
                   <p>Total Price: &#8377;<span id='total'> ${amount} </span></p>
                   `
                );

   // $('.kol-price').append(price);
   //price.appendTo($('.kol-price'));
  // $(this).after(price);
  //$(this).closest('.card').append(price); 
  vacation.append(price);
  $(this).remove();

});




$('#filters').on('click','.onsale-filter',function(){
    $('.bg-warning').removeClass('bg-warning');
   
    $('.card').filter('.onsale').addClass('bg-success');

});

$('#filters').on('click','.expiring-filter',function(){

    $('.bg-success').removeClass('bg-success');
    $('.card').filter('.expiring').addClass('bg-warning');

});


$('.card').on('keyup change', '.quantity', function() {
    var price = +$(this).closest('.card').data('price');
    var quantity = +$(this).val();
    $('#total').text(price * quantity);
  });


});