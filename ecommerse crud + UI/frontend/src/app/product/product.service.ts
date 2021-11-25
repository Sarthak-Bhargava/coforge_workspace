import { ProductService } from './employee.service';
import { ProductComponent } from './product/product.component';
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  product: Product = new Product();
  submitted = false;

  constructor(private productService: ProductService,
    private router: Router) { }

  ngOnInit() {
  }

  newEmployee(): void {
    this.submitted = false;
    this.product = new Product();
  }

  save() {

  this.productService.createEmployee(this.product).subscribe(data => {
      
    }, 
    error => console.log(error));
  }

  onSubmit() {
    this.submitted = true;
    this.save();    // this method is called on click submit
  }

  gotoList() {
    this.router.navigate(['/products']);
  }
}
