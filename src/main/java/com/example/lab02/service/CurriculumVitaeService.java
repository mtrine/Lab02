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
    public void update(CurriculumVitaeRequest curriculumVitae) {

    }

    


    @Override
    public void delete(Long id) {

    }
}
