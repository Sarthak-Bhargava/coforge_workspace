import { Component, NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { ProductComponent } from './product/product.component';
const routes: Routes = [
  {path: '',
component: HomeComponent,
pathMatch: 'full'
  },
{
  path: 'login',
  component: LoginComponent,
  pathMatch: 'full'
},
{
  path: 'login/dashboard',
  component: DashboardComponent,
  pathMatch: 'full'
},
{
  path: '/login/dashboard/product',
  component: ProductComponent
},
{
  path:'/login/dashboard/order'
}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
