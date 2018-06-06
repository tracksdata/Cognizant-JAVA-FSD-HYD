function loadImage(imageName){

    var path='Cars/'+imageName.value+'.jpg';
   
    document.getElementById('carImage').innerHTML=`<image src=${path} height='200' width='200' border=1>`;

}