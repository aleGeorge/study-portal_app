package com.bunkless.studyportal.controller;

import com.bunkless.studyportal.entity.Course;
import com.bunkless.studyportal.service.courseService;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/courses")
public class courseController {
    private final courseService courseservice;

    public courseController(courseService courseservice){
        this.courseservice = courseservice;
    }

    @PostMapping
    public ResponseEntity<Course> addCourse(@RequestBody Course course){
        return ResponseEntity.ok(courseservice.addCourse(course));
    }
    @GetMapping
    public ResponseEntity<List<Course>> getAllCourses(){
        return ResponseEntity.status(200).body(courseservice.getAllCourses());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Course> getCourseById(
            @PathVariable Long id) {

        return ResponseEntity.ok(
                courseservice.getCourseById(id)
        );
    }
   @PutMapping("/{id}")
    public ResponseEntity<Course> updateCourse(@PathVariable Long id,@RequestBody Course course){
        return ResponseEntity.ok(courseservice.updateCourse(id,course));
   }
  @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCourseById(@PathVariable Long id){
        courseservice.deleteCourseById(id);
        return ResponseEntity.noContent().build();
  }
}
