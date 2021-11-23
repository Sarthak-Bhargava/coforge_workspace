import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { BillingComponent } from './billing/billing.component';
import { OrderComponent } from './order/order.component';
import { ProductComponent } from './product/product.component';
import { CustomerComponent } from './customer/customer.component';
import { AddressComponent } from './address/address.component';

const routes: Routes = [

{path:'product',component:ProductComponent},
{path:'order',component:OrderComponent},
{path:'bill',component:BillingComponent},
{path:'customer',component:CustomerComponent },
{path: 'address', component:AddressComponent},
{path:'',redirectTo:'/product',pathMatch:'full'}  //redirect to landing page
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
