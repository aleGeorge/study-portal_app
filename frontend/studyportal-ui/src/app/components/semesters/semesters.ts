import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-semesters',
  standalone: true,
  imports: [],
  templateUrl: './semesters.html',
  styleUrl: './semesters.css'
})
export class Semesters {

  constructor(private router: Router) {}

  openSemester(semester: number) {

    this.router.navigate(
      ['/subjects'],
      {
        queryParams: {
          semester: semester
        }
      }
    );

  }

}