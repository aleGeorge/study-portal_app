import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Semesters } from './semesters';

describe('Semesters', () => {
  let component: Semesters;
  let fixture: ComponentFixture<Semesters>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Semesters],
    }).compileComponents();

    fixture = TestBed.createComponent(Semesters);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
