package com.bunkless.studyportal.repository;

import com.bunkless.studyportal.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface courseRepository extends JpaRepository<Course,Long> {
}
