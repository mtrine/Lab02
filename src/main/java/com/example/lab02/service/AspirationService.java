package com.example.lab02.service;

import com.example.lab02.dtos.request.AspirationRequest;
import com.example.lab02.pojo.Aspiration;
import com.example.lab02.repository.IAspirationRepository;

import java.util.List;

public class AspirationService implements IAspirationService {
    private IAspirationRepository AspirationRepository;
    @Override
    public List<Aspiration> findAll() {
        return AspirationRepository.findAll();
    }

    @Override
    public Aspiration findById(Long id) {
        return AspirationRepository.findById(id).get();
    }

    @Override
    public void update(AspirationRequest Aspiration) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Aspiration create(AspirationRequest Aspiration) {
        return new Aspiration();
    }
}