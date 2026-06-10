import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CommonModule } from '@angular/common';
import { SubjectService } from '../../services/subject.service';
// import { SubjectService } from '../../services/subject.service';

@Component({
  selector: 'app-subjects',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './subjects.html',
  styleUrls: ['./subjects.css']
})
export class Subjects implements OnInit {

  semesterNumber = 0;

  subjects: any[] = [];

  constructor(
    private route: ActivatedRoute,
    private subjectService: SubjectService
  ) {}

  ngOnInit(): void {

    this.route.queryParams.subscribe(params => {

      this.semesterNumber =
        Number(params['semester']);

      console.log(
        'Selected Semester:',
        this.semesterNumber
      );

      this.loadSubjects();

    });

  }

  loadSubjects(): void {

    this.subjectService
      .getSubjectsBySemester(
        this.semesterNumber
      )
      .subscribe({

        next: (data:any) => {

          console.log(
            'API Response:',
            data
          );

          this.subjects = data;

        },

        error: (error:any) => {

          console.error(
            'API Error:',
            error
          );

        }

      });

  }

}