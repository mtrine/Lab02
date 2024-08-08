package com.example.lab02.controller;

import com.example.lab02.dtos.request.EducationInformationRequest;
import com.example.lab02.pojo.EducationInformation;
import com.example.lab02.service.EducationInformationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/educationinformations")
public class EducationInformationController {
    private EducationInformationService educationInformationService;

    @PostMapping
    public EducationInformation add(@RequestBody EducationInformationRequest request) {
        return educationInformationService.create(request);
    }
}
