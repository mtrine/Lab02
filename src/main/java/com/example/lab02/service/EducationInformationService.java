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
    public void update(EducationInformationRequest EducationInformation) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public EducationInformation create(EducationInformationRequest EducationInformation) {
        return new EducationInformation();
    }
}