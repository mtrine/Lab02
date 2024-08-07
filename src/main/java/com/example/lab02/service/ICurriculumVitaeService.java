package com.example.lab02.service;

import com.example.lab02.dtos.request.CurriculumVitaeRequest;
import com.example.lab02.pojo.CurriculumVitae;

import java.util.List;

public interface ICurriculumVitaeService {
    List<CurriculumVitae> findAll();
    CurriculumVitae findById(Long id);
    void update(CurriculumVitaeRequest curriculumVitae);
    void delete(Long id);

}
