import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Demoservice } from '../demo.service';
import { Product } from '../product';


@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  submitted = false;
  prod: Product = new Product();  //create object in angular

  // inject the depedency of service class here
constructor(private demoservice1: Demoservice) { }

  ngOnInit(): void {
    
  }
// declared a user defined fucntions



save(){

  this.demoservice1.getDetails(this.prod).subscribe(data => {
    console.log(data)
    this.employee = new Employee();
    this.gotoList();
  }, 
  error => console.log(error));




}



onSubmit() {
  this.submitted = true;   //flag
  this.save();    
}



}
