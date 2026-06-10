package com.bunkless.studyportal.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bunkless.studyportal.entity.Subject;
import com.bunkless.studyportal.service.SubjectService;

@RestController
@RequestMapping("/api/subjects")
public class SubjectController {

 private final SubjectService subjectService;

public SubjectController(SubjectService subjectService){
    this.subjectService = subjectService;
}
@PostMapping
    public ResponseEntity<Subject> saveSubject(@RequestBody Subject subject){
    return ResponseEntity.ok(subjectService.saveSubject(subject));
}
@GetMapping
    public ResponseEntity<List<Subject>> getAllSubjects(){
    return ResponseEntity.ok(subjectService.getAllSubject());
}
@PutMapping("{id}")
    public ResponseEntity<Subject> updateSubject(@PathVariable Long id,@RequestBody Subject subject){
    return ResponseEntity.ok(subjectService.updateSubject(id,subject));
}
@GetMapping("/{id}")
    public ResponseEntity<Subject> getSubjectById(@PathVariable Long id){
    return ResponseEntity.ok(subjectService.getSubjectById(id));
}
@GetMapping("/semester/{semesterNo}")
public ResponseEntity<List<Subject>>
getSubjectsBySemester(
        @PathVariable Integer semesterNo){

    return ResponseEntity.ok(
            subjectService
                    .getSubjectsBySemester(semesterNo)
    );

}
}
