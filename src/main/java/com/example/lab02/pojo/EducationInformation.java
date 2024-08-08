package com.example.lab02.pojo;


import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name ="EducationInformation")
public class EducationInformation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="education_level")
    private Integer educationLevel;

    @Column(name="academic_level")
    private String academicLevel;

    @Column(name="university")
    private String university;

    @Column(name="major")
    private String major;

    @Column(name="graduate_year")
    private Integer graduateYear;

    @Column(name="classification")
    private Integer classification;

    @Column(name="foreign_language")
    private String foreignLanguage;

    @Column(name="foreign_level")
    private String foreignLevel;

    @Column(name="foreign_grades")
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
