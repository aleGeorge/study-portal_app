package com.bunkless.studyportal.service;

import org.springframework.stereotype.Service;

import com.bunkless.studyportal.dto.DashboardResponse;

@Service
public class DashboardService {

    public DashboardResponse getDashboardData() {

        DashboardResponse response = new DashboardResponse();

        response.setStudentName("Alen");
        response.setTotalSemesters(8);
        response.setTotalSubjects(48);
        response.setTotalBacklogs(5);
        response.setClearedBacklogs(3);

        return response;
    }
}