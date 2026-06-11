package com.bunkless.studyportal.dto;

public class DashboardResponse {

    private String studentName;
    private int totalSemesters;
    private int totalSubjects;
    private int totalBacklogs;
    private int clearedBacklogs;

    public DashboardResponse() {
    }

    public DashboardResponse(
            String studentName,
            int totalSemesters,
            int totalSubjects,
            int totalBacklogs,
            int clearedBacklogs) {

        this.studentName = studentName;
        this.totalSemesters = totalSemesters;
        this.totalSubjects = totalSubjects;
        this.totalBacklogs = totalBacklogs;
        this.clearedBacklogs = clearedBacklogs;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getTotalSemesters() {
        return totalSemesters;
    }

    public void setTotalSemesters(int totalSemesters) {
        this.totalSemesters = totalSemesters;
    }

    public int getTotalSubjects() {
        return totalSubjects;
    }

    public void setTotalSubjects(int totalSubjects) {
        this.totalSubjects = totalSubjects;
    }

    public int getTotalBacklogs() {
        return totalBacklogs;
    }

    public void setTotalBacklogs(int totalBacklogs) {
        this.totalBacklogs = totalBacklogs;
    }

    public int getClearedBacklogs() {
        return clearedBacklogs;
    }

    public void setClearedBacklogs(int clearedBacklogs) {
        this.clearedBacklogs = clearedBacklogs;
    }
}