import { Component, OnInit } from '@angular/core';
import {FormControl, Validators, ReactiveFormsModule} from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from 'src/app/services/login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  //email Validation
  emailFormControl = new FormControl('', [Validators.required, Validators.email]);
  //password hide true or false
  hide = true;

  credentials={
    email:'',
    password:''
  }

  constructor(private router: Router) {
  }

  ngOnInit(): void {
  }

  //submit function
  onSubmit(){
    //console.log("login form submited!!")
    if((this.credentials.email!='' && this.credentials.password!='')&& (this.credentials.email!=null && this.credentials.password)&&(this.emailFormControl && this.credentials.password!='') ){
      // TODO document why this block is empty
      this.router.navigate(['/profile']);
    }
    else{
      console.log("values are empty");
    }
  }
}
