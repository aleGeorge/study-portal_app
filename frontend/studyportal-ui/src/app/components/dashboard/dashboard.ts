import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './dashboard.html',
  styleUrl: './dashboard.css'
})
export class Dashboard {

  username = 'Alen';

  stats = [
    { title: 'Semesters', value: 8 },
    { title: 'Subjects', value: 48 },
    { title: 'Completed', value: '60%' }
  ];

  recentSubjects = [
    'Data Structures',
    'Digital Electronics',
    'Power Systems',
    'Signals & Systems'
  ];

  constructor(private router: Router) {}

  logout() {
    localStorage.removeItem('rememberedUser');
    this.router.navigate(['/']);
  }
}