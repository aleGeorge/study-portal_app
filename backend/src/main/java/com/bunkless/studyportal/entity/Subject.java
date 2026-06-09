package com.bunkless.studyportal.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;

import java.util.List;

@Entity
@Table(name="subjects")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subjectCode;
    private String subjectName;

    @ManyToOne
    @JoinColumn(name = "semester_id")
    @JsonBackReference
    private Semester semester;

    @JsonManagedReference
    @OneToMany(mappedBy = "subject",cascade = CascadeType.ALL)
    private List<Course> courses;

    public Subject() {

    }

    public Subject(Long id, String subjectCode, String subjectName, Semester semester) {
        this.id = id;
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.semester = semester;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }
    public List<Course> getCourses(){
        return courses;
    }
    public void setCourses(List<Course>courses){
        this.courses = courses;
    }
}
