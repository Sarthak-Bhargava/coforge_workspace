import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { HelpComponent } from './help/help.component';
import { HomeComponent } from './home/home.component';

//routing  module
 const routes: Routes =[
   { path :'help',component:HelpComponent},
    {path:'home', component:HomeComponent},
    {path:'aboutus',component:AboutusComponent},

    {path:'',redirectTo:'/home',pathMatch:'full'}


 ];



@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
