package com.example.lab02.controller;

import com.example.lab02.dtos.request.AspirationRequest;
import com.example.lab02.pojo.Aspiration;
import com.example.lab02.service.AspirationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/aspirations")
public class AspirationController {
    private AspirationService aspirationService;

    @PostMapping
    public Aspiration createAspiration(@RequestBody AspirationRequest request) {
        return aspirationService.create(request);
    }

    @GetMapping
    public List<Aspiration> getAllAspirations() {
        return aspirationService.findAll();
    }

    @GetMapping("/{id}")
    public Aspiration getAspirationById(@PathVariable("id") Long id) {
        return aspirationService.findById(id);
    }

}
