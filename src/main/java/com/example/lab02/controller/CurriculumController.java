package com.example.lab02.controller;

import com.example.lab02.dtos.request.CurriculumVitaeRequest;
import com.example.lab02.pojo.CurriculumVitae;
import com.example.lab02.repository.ICurriculumVitaeRepository;
import com.example.lab02.service.ICurriculumVitaeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/curriculumvitaes")
public class CurriculumController {

    private ICurriculumVitaeService curriculumVitaeService;
    @GetMapping
    public List<CurriculumVitae> getAllCurriculum() {
        return curriculumVitaeService.findAll();
    }
    @PostMapping
    public CurriculumVitae createCurriculum(@RequestBody CurriculumVitaeRequest curriculumVitae) {
        return curriculumVitaeService.create(curriculumVitae);
    }
}
