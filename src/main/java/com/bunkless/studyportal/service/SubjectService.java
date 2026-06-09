package com.bunkless.studyportal.service;

import com.bunkless.studyportal.entity.Subject;
import com.bunkless.studyportal.repository.SemesterRepository;
import com.bunkless.studyportal.repository.SubjectRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubjectService {
    private final SubjectRepository subjectRepository;

    public SubjectService (SubjectRepository subjectRepository){
        this.subjectRepository = subjectRepository;
    }

    public Subject saveSubject(Subject subject){
        return subjectRepository.save(subject);
    }
    public List<Subject> getAllSubject(){
        return subjectRepository.findAll();
    }
    public Subject updateSubject(Long id,Subject subject){
        Subject existingSub = subjectRepository.findById(id).orElseThrow(()->new RuntimeException("Subject not found"));

        existingSub.setSubjectCode(subject.getSubjectCode());
        existingSub.setSubjectName(subject.getSubjectName());
        return subjectRepository.save(existingSub);
    }
    public Subject getSubjectById(Long id){
        return subjectRepository.findById(id).orElseThrow(()->new RuntimeException("Subject not found with id"+ id));
    }
}
