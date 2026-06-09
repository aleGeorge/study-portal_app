package com.bunkless.studyportal.controller;

import com.bunkless.studyportal.entity.Subject;
import com.bunkless.studyportal.service.SubjectService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
}
