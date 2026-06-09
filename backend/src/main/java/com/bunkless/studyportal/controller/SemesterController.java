package com.bunkless.studyportal.controller;

import com.bunkless.studyportal.entity.Semester;
import com.bunkless.studyportal.repository.SemesterRepository;
import com.bunkless.studyportal.service.SemesterService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/semesters")
public class SemesterController {
    private final SemesterService semesterService;

    public SemesterController(SemesterService semesterService){
        this.semesterService = semesterService;
    }

    @PostMapping
    public ResponseEntity<Semester> addSemester(@RequestBody Semester semester){
        return ResponseEntity.ok(semesterService.saveSemester(semester));
    }
    @GetMapping
    public ResponseEntity<List<Semester>> getAllSemesters(){
        return ResponseEntity.ok(semesterService.getAllSemester());
    }
    @PutMapping("/{id}")
    public ResponseEntity<Semester> updateSemester(@PathVariable Long id,@RequestBody Semester semester){
        return ResponseEntity.ok(semesterService.updateSemester(id,semester));
    }
}
