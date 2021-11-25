import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {


  cat = []

    categoryid = ''
    name: string
    price: string
    discount: string
    manufacturer: string
    description: string
    image: any

    service: ProductService
    constructor(private router: Router,
        productservice: ProductService,
        private catservice:ProductService) { 
            this.service = productservice
        }

    back()
    {
        this.router.navigate(['/login/dashboard/product'])
    }
    addProduct()
    {
        
        this.service.addService(this.name,this.price, this.discount, this.priceWithDiscount,
        this.doseInMG,this.mgfdate,this.expiredate,this.description,this.image,this.categoryid
        ).subscribe((response)=>{
                if(response['status']=='success')
                {
                    alert('added product')
                }
                else
                {
                    console.log(response['error'])
                    alert('error')
                }
            })
    }



    ngOnInit() {
        this.loadCategories()
     }

     loadCategories(){
      this.catservice.getCategories().subscribe(response =>{
          if(response['status']=='success')
          {
              this.cat = response['data']
             
              if(this.cat.length > 0)
                this.categoryid = this.cat[0].id
          }
      })
  }

}
