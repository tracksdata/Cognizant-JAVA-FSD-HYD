import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  constructor(private http:HttpClient) { }
  

  loadProducts(){
      return this.http.get('http://localhost:8080/api/product/');
  }

  loadProduct(prodId){
    return this.http.get(`http://localhost:3000/api/products/${prodId}`)
  }
  submitProduct(product){
    product.makeDate=Date.now();
    return this.http.post('http://localhost:3000/api/products',product)
  }


}
