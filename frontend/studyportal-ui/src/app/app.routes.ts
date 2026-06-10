import { Routes } from '@angular/router';
import { Login } from './components/login/login';
import { Register } from './components/register/register';
import { ForgotPassword } from './components/forgot-password/forgot-password';
import { ResetPassword } from './components/reset-password/reset-password';
import { Dashboard } from './components/dashboard/dashboard';
import { Semesters } from './components/semesters/semesters';
import { Subject } from 'rxjs';
import { Videos } from './components/videos/videos';
import { Notes } from './components/notes/notes';
import { Profile } from './components/profile/profile';
import { Subjects } from './components/subjects/subjects';

export const routes: Routes = [
  {
    path: '',
    component: Login
  },
  {
    path:'login',
    component:Login
  },
  {
    path: 'register',
    component: Register
  },
  {
    path:'forgot-password',
    component:ForgotPassword
  },
  {
    path:'reset-password',
    component:ResetPassword
  },
  {
    path:'dashboard',
    component:Dashboard
  },
  {path:'semesters',component:Semesters},
  {path:'subjects',component:Subjects},
  {path:'videos',component:Videos},
  {path:'notes',component:Notes},
  {path:'profile',component:Profile}
];
