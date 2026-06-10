import { Component } from '@angular/core';
import { FormBuilder, Validators, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-reset-password',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './reset-password.html',
  styleUrl: './reset-password.css'
})
export class ResetPassword {

  resetForm;

  constructor(private fb: FormBuilder){

    this.resetForm = this.fb.group({
      password: ['', [Validators.required, Validators.minLength(6)]],
      confirmPassword: ['', Validators.required]
    });

  }

  onSubmit(){

    const { password, confirmPassword } = this.resetForm.value;

    if(password !== confirmPassword){
      alert('Passwords do not match');
      return;
    }

    // call backend API later

    alert('Password Updated Successfully');

  }

}