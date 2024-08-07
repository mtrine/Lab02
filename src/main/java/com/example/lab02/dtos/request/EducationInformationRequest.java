package com.example.lab02.dtos.request;

public class EducationInformationRequest {
    private Integer educationLevel;
    private String academicLevel;
    private String university;
    private String major;
    private Integer graduateYear;
    private Integer classification;
    private String foreignLanguage;
    private String foreignLevel;
    private Double foreignGrades;

    public Integer getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(Integer educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(String academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public Integer getGraduateYear() {
        return graduateYear;
    }

    public void setGraduateYear(Integer graduateYear) {
        this.graduateYear = graduateYear;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    public String getForeignLanguage() {
        return foreignLanguage;
    }

    public void setForeignLanguage(String foreignLanguage) {
        this.foreignLanguage = foreignLanguage;
    }

    public String getForeignLevel() {
        return foreignLevel;
    }

    public void setForeignLevel(String foreignLevel) {
        this.foreignLevel = foreignLevel;
    }

    public Double getForeignGrades() {
        return foreignGrades;
    }

    public void setForeignGrades(Double foreignGrades) {
        this.foreignGrades = foreignGrades;
    }
}
