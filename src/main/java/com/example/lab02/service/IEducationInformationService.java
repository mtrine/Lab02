package com.example.lab02.service;

import com.example.lab02.dtos.request.EducationInformationRequest;
import com.example.lab02.pojo.EducationInformation;

import java.util.List;

public interface IEducationInformationService {
    List<EducationInformation> findAll();
    EducationInformation findById(Long id);
    void update(EducationInformationRequest EducationInformation);
    void delete(Long id);
    EducationInformation create(EducationInformationRequest EducationInformation);
}
