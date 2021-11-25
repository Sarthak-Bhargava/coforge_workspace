import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  email1 = ''
  password1 = ''

  constructor(private router: Router) { }

  onlogin() {
    if(this.email1 == "sarthak" && this.password1 == "1234") {
    this.router.navigate(['/login/dashboard'])
    alert('login successfull')
    }
    else 
    alert('enter the valid password')
  }

  ngOnInit(): void {
  }

}
