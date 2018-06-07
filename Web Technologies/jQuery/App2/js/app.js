
$(document).ready(function(){

    $('.btn-primary').on('click',function(){
        var vacation=$(this).closest('.vacation');
        
        var amount=vacation.data('price');
         var price=` <p>
              <p>&#8377;${amount} per ticket</p>
                    Tickets:
                    <input type='number' class='quantity' value='1' min='1' />
                    <hr/>
                    <p>Total Ticket Price:<span class='total'>${amount}</span> </p>
                    </p>
                    
                    `;
        //var price=$(`<p>From &#8377;${amount} </p>`);
        
      
        //$('.vacation').append(price);
        //price.appendTo($('.vacation'));
        //$('.vacation').append(price);
       // $(this).after(price);
       vacation.append(price); 
       //$('button').remove();
        $(this).remove();
    });


    $(this).on('keyup change','.quantity',function(){
        var price = +$(this).closest('.vacation').data('price');
        var quantity = +$(this).val();
        //$('#total').text(quantity*price);
        $(this).parent().parent().find('.total').text(quantity*price);
    })

    $('#filters').on('click','.onsale-filter',function(){
       $('.bg-warning').removeClass('bg-warning');
        $('.card').filter('.onsale').addClass('bg-primary');
       
    })

    $('#filters').on('click','.expiring-filter',function(){
        $('.bg-primary').removeClass('bg-primary');
        $('.card').filter('.expiring').addClass('bg-warning');
    })



});
