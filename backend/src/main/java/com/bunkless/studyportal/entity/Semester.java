package com.bunkless.studyportal.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "semesters")
public class Semester {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer semesterNo;

    private String name;

    @JsonManagedReference
    @OneToMany(mappedBy = "semester",cascade = CascadeType.ALL)
    private List<Subject> subjects;

    public Semester() {
    }

    public Semester(Long id, Integer semesterNo, String name) {
        this.id = id;
        this.semesterNo = semesterNo;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getSemesterNo() {
        return semesterNo;
    }

    public void setSemesterNo(Integer semesterNo) {
        this.semesterNo = semesterNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Semester{" +
                "id=" + id +
                ", semesterNo=" + semesterNo +
                ", name='" + name + '\'' +
                '}';
    }
}