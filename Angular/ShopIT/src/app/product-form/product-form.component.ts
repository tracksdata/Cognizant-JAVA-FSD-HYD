import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router, ActivatedRoute } from '@angular/router';
import { ProductService } from '../product.service';

@Component({
  selector: 'app-product-form',
  templateUrl: './product-form.component.html',
  styleUrls: ['./product-form.component.css']
})
export class ProductFormComponent implements OnInit {

  productForm: FormGroup;
  isEdit = false;
  originalProuct: any;

  constructor(private route: ActivatedRoute, private router: Router, private fb: FormBuilder, private productService: ProductService) { }

  ngOnInit() {
    this.productForm = 
    this.fb.group({
      id: [''],
      name: ['', [Validators.required]],
      price: [0],
      image: [''],
      makeDate: [''],
      description: ['']
    });

    this.route.data.subscribe(data => {
      console.dir(data)
      this.productForm.patchValue(data.product)
      this.originalProuct = data.product;
      this.isEdit = true;
    })

  }

  handleSubmit() {
    if (this.productForm.valid) {
      this.productService.submitProduct(this.productForm.value)
        .subscribe(product => {
          this.router.navigate(['products'])
        })
    }
  }
}

