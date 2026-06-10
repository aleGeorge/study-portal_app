import { Component } from '@angular/core';
import { ReactiveFormsModule, FormBuilder, Validators } from '@angular/forms';
import { Router, RouterLink } from "@angular/router";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule, RouterLink],
  templateUrl: './login.html',
  styleUrl: './login.css'
})
export class Login {

  loginForm;

  constructor(private fb: FormBuilder,private router: Router) {

  this.loginForm = this.fb.group({
    username: ['', Validators.required],
    password: ['', [Validators.required, Validators.minLength(6)]],
    rememberMe: [false]

  });
  this.loadRememberedUser();

  }

  onSubmit() {

    if (this.loginForm.valid) {
      console.log(this.loginForm.value);
    }
    
  this.router.navigate(['/dashboard']);

  }
  loadRememberedUser(){
    const savedUser = localStorage.getItem('rememberedUser');
    if(savedUser){
      this.loginForm.patchValue({
        username:savedUser,
        rememberMe : true
      });
    }
  }
  rememberUser() {

  const username = this.loginForm.get('username')?.value;
  const rememberMe = this.loginForm.get('rememberMe')?.value;

  if (rememberMe && username) {

    localStorage.setItem('rememberedUser', username);

  } else {

    localStorage.removeItem('rememberedUser');

  }

}
 
}
