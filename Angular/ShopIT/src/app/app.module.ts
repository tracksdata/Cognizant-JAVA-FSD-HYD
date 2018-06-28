import { ListProductsComponent } from './list-products/list-products.component';
import { ProductService } from './product.service';
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule,Routes} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { ProductFormComponent } from './product-form/product-form.component';


let routes:Routes=[
  {path:'',component:HomeComponent},
  {path:'products',component:ListProductsComponent},
  {path:'addproduct',component:ProductFormComponent}
];


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    ListProductsComponent,
    ProductFormComponent
    ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    HttpClientModule,
    FormsModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
