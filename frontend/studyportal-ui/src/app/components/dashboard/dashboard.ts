import { Component, OnInit } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Router, RouterLink } from '@angular/router';
import { DashboardService } from '../../services/DashboardService.service';
import { DashboardData } from '../../models/dashboard-data';

@Component({
  selector: 'app-dashboard',
  standalone: true,
  imports: [CommonModule, RouterLink],
  templateUrl: './Dashboard.html',
  styleUrls: ['./Dashboard.css']
})
export class Dashboard implements OnInit {

// dashboardData: any = {};
dashboardData = {
  studentName: '',
  totalSemesters: 0,
  totalSubjects: 0,
  totalBacklogs: 0,
  clearedBacklogs: 0
};

  progressPercentage = 0;

  constructor(
    private dashboardService: DashboardService,
    private router: Router
  ) {}

  ngOnInit(): void {

    // this.dashboardService.getDashboard()
    this.dashboardService.getDashboard()
      .subscribe({

        next: (response) => {

          console.log('Dashboard Response:', response);

          this.dashboardData = response;

          this.progressPercentage =
            response.totalBacklogs > 0
              ? (response.clearedBacklogs / response.totalBacklogs) * 100
              : 0;

        },

        error: (error) => {
          console.error(error);
        }

      });

  }

  logout(): void {
    localStorage.removeItem('rememberedUser');
    this.router.navigate(['/']);
  }

}