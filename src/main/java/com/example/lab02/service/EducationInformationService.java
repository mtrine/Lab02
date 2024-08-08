package com.example.lab02.service;

import com.example.lab02.dtos.request.EducationInformationRequest;
import com.example.lab02.pojo.EducationInformation;
import com.example.lab02.repository.IEducationInformationRepository;

import java.util.List;

public class EducationInformationService implements IEducationInformationService {
    private IEducationInformationRepository EducationInformationRepository;
    @Override
    public List<EducationInformation> findAll() {
        return EducationInformationRepository.findAll();
    }

    @Override
    public EducationInformation findById(Long id) {
        return EducationInformationRepository.findById(id).get();
    }

    @Override
    public void update(Long id, EducationInformationRequest request) {
        EducationInformation educationInformation = findById(id);
        educationInformation.setEducationLevel(request.getEducationLevel());
        educationInformation.setAcademicLevel(request.getAcademicLevel());
        educationInformation.setUniversity(request.getUniversity());
        educationInformation.setMajor(request.getMajor());
        educationInformation.setGraduateYear(request.getGraduateYear());
        educationInformation.setClassification(request.getClassification());
        educationInformation.setForeignLanguage(request.getForeignLanguage());
        educationInformation.setForeignLevel(educationInformation.getForeignLanguage());
        educationInformation.setForeignGrades(educationInformation.getForeignGrades());

        EducationInformationRepository.save(educationInformation);
        
    }

    @Override
    public void delete(Long id) {
        EducationInformation educationInformation = findById(id);
        EducationInformationRepository.delete(educationInformation);
    }

    @Override
    public EducationInformation create(EducationInformationRequest request) {
        EducationInformation educationInformation = new EducationInformation();
        educationInformation.setEducationLevel(request.getEducationLevel());
        educationInformation.setAcademicLevel(request.getAcademicLevel());
        educationInformation.setUniversity(request.getUniversity());
        educationInformation.setMajor(request.getMajor());
        educationInformation.setGraduateYear(request.getGraduateYear());
        educationInformation.setClassification(request.getClassification());
        educationInformation.setForeignLanguage(request.getForeignLanguage());
        educationInformation.setForeignLevel(educationInformation.getForeignLanguage());
        educationInformation.setForeignGrades(educationInformation.getForeignGrades());

       return EducationInformationRepository.save(educationInformation);
    }
}