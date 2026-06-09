package com.bunkless.studyportal.service;

import com.bunkless.studyportal.entity.Course;
import com.bunkless.studyportal.repository.courseRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class courseService {
    private final courseRepository courserepository;

    public courseService (courseRepository courserepository){
        this.courserepository = courserepository;
    }

    public Course addCourse(Course course){
        Course saved = courserepository.save(course);
        System.out.println("Saved Id = " + saved.getId());
        return saved;
    }
    public List<Course> getAllCourses(){
        return courserepository.findAll();
    }
    public Course getCourseById(Long id) {

        return courserepository.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Course not found with id: " + id));
    }

    public Course updateCourse(Long id,Course course){
        Course existingCourse = courserepository.findById(id)
                .orElseThrow(()->new RuntimeException("Course not found with id"+id));

        existingCourse.setTitle(course.getTitle());
        existingCourse.setDescription(course.getDescription());
        existingCourse.setSubject(course.getSubject());

        return courserepository.save(existingCourse);
    }
    public void deleteCourseById(Long id){
        courserepository.deleteById(id);
    }
//    public void deleteCourse(Long id,Course course){
//        Course existCourse = courserepository.findById(id)
//                .orElseThrow(()->new RuntimeException("Course not found with id"+id));
//        if(existCourse.equals(course)){
//            courserepository.delete(course);
//        }
    }

