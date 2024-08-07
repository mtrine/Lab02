package com.example.lab02.service;

import com.example.lab02.dtos.request.CurriculumVitaeRequest;
import com.example.lab02.pojo.CurriculumVitae;
import com.example.lab02.repository.ICurriculumVitaeRepository;

import java.util.List;

public class CurriculumVitaeService implements ICurriculumVitaeService {
    private ICurriculumVitaeRepository curriculumVitaeRepository;
    @Override
    public List<CurriculumVitae> findAll() {
        return curriculumVitaeRepository.findAll();
    }

    @Override
    public CurriculumVitae findById(Long id) {
        return curriculumVitaeRepository.findById(id).get();
    }

    @Override
    public void update(Long id, CurriculumVitaeRequest request) {
        CurriculumVitae curriculumVitae = curriculumVitaeRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
        curriculumVitae.setAvatar(request.getAvatar());
        curriculumVitae.setBirthDate(request.getBirthDate());
        curriculumVitae.setBirthPlace(request.getBirthPlace());
        curriculumVitae.setEthnicity(request.getEthnicity());
        curriculumVitae.setGender(request.getGender());
        curriculumVitae.setFirstName(request.getFirstName());
        curriculumVitae.setLastName(request.getLastName());
        curriculumVitae.setIdType(request.getIdType());
        curriculumVitae.setPositionApplied(request.getPositionApplied());
        curriculumVitae.setMaritalStatus(request.getMaritalStatus());
        curriculumVitae.setReligion(request.getReligion());
        curriculumVitae.setNationality(request.getNationality());
        curriculumVitae.setIdIssueDate(request.getIdIssueDate());
        curriculumVitae.setIdIssuePlace(request.getIdIssuePlace());
        curriculumVitae.setIdExpiryDate(request.getIdExpiryDate());
        curriculumVitaeRepository.save(curriculumVitae);
    }


    @Override
    public void delete(Long id) {
        CurriculumVitae curriculumVitae = findById(id);
        curriculumVitaeRepository.delete(curriculumVitae);
    }

    @Override
    public CurriculumVitae create(CurriculumVitaeRequest request) {
        CurriculumVitae curriculumVitae = new CurriculumVitae();
        curriculumVitae.setAvatar(request.getAvatar());
        curriculumVitae.setBirthDate(request.getBirthDate());
        curriculumVitae.setBirthPlace(request.getBirthPlace());
        curriculumVitae.setEthnicity(request.getEthnicity());
        curriculumVitae.setGender(request.getGender());
        curriculumVitae.setFirstName(request.getFirstName());
        curriculumVitae.setLastName(request.getLastName());
        curriculumVitae.setIdType(request.getIdType());
        curriculumVitae.setPositionApplied(request.getPositionApplied());
        curriculumVitae.setMaritalStatus(request.getMaritalStatus());
        curriculumVitae.setReligion(request.getReligion());
        curriculumVitae.setNationality(request.getNationality());
        curriculumVitae.setIdIssueDate(request.getIdIssueDate());
        curriculumVitae.setIdIssuePlace(request.getIdIssuePlace());
        curriculumVitae.setIdExpiryDate(request.getIdExpiryDate());
        return curriculumVitaeRepository.save(curriculumVitae);
    }
}
