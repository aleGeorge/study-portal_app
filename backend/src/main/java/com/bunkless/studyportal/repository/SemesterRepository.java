package com.bunkless.studyportal.repository;

import com.bunkless.studyportal.entity.Semester;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SemesterRepository extends JpaRepository<Semester,Long> {

}
