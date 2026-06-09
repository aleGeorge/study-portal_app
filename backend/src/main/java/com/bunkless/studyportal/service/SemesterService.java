package com.bunkless.studyportal.service;

import com.bunkless.studyportal.entity.Semester;
import com.bunkless.studyportal.repository.SemesterRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SemesterService {
    private final SemesterRepository semRepo;

    public SemesterService(SemesterRepository semRepo){
        this.semRepo = semRepo;
    }
    public Semester saveSemester(Semester semester){
        return semRepo.save(semester);
    }
    public List<Semester> getAllSemester(){
        return semRepo.findAll();
    }
    public Semester updateSemester(Long id,Semester updateSemester){
        Semester existingSem = semRepo.findById(id)
                .orElseThrow(()->new RuntimeException("Semester not found"));
        existingSem.setSemesterNo(updateSemester.getSemesterNo());
        existingSem.setName(updateSemester.getName());
        return semRepo.save(existingSem);
    }
}
