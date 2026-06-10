package com.bunkless.studyportal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bunkless.studyportal.entity.Subject;

public interface SubjectRepository extends JpaRepository<Subject,Long>{

    List<Subject> findBySemesterSemesterNo(Integer semesterNo);

}