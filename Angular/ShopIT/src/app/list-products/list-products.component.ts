import { Component, OnInit } from '@angular/core';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-list-products',
  templateUrl: './list-products.component.html',
  styleUrls: ['./list-products.component.css']
})
export class ListProductsComponent implements OnInit {

  constructor(private productService:ProductService) { }

  products:any=[];

  ngOnInit() {
    this.productService.loadProducts()
    .subscribe(resp=>{
      this.products=resp;
    //  console.log(this.products);
    });
  }

}
