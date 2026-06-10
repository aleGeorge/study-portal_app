import { Component } from '@angular/core';
import { FormBuilder, Validators, ReactiveFormsModule } from '@angular/forms';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-forgot-password',
  standalone: true,
  imports: [ReactiveFormsModule, RouterLink],
  templateUrl: './forgot-password.html',
  styleUrl: './forgot-password.css'
})
export class ForgotPassword {

  forgotForm;

  constructor(
    private fb: FormBuilder,
    private router: Router
  ) {

    this.forgotForm = this.fb.group({
      email: ['', [Validators.required, Validators.email]]
    });

  }

  onSubmit() {

    if(this.forgotForm.valid){

      // later verify email from backend

      this.router.navigate(['/reset-password']);

    }

  }

}