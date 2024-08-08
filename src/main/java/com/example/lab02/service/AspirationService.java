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
    public void update(Long id,AspirationRequest request) {
        Aspiration aspiration=findById(id);
        aspiration.setDesiredSalary(request.getDesiredSalary());
        aspiration.setDesiredStartDate(request.getDesiredStartDate());
        aspiration.setDesiredWorkplace(request.getDesiredWorkplace());
        aspiration.setOtherRequest(request.getOtherRequest());
        AspirationRepository.saveAndFlush(aspiration);
    }

    @Override
    public void delete(Long id) {
        Aspiration aspiration=findById(id);
        AspirationRepository.delete(aspiration);
    }

    @Override
    public Aspiration create(AspirationRequest request) {
        Aspiration aspiration=new Aspiration();
        aspiration.setDesiredStartDate(request.getDesiredStartDate());
        aspiration.setDesiredWorkplace(request.getDesiredWorkplace());
        aspiration.setOtherRequest(request.getOtherRequest());
        return AspirationRepository.save(aspiration);
    }
}