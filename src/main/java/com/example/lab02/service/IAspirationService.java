package com.example.lab02.service;

import com.example.lab02.dtos.request.AspirationRequest;
import com.example.lab02.pojo.Aspiration;

import java.util.List;

public interface IAspirationService{
    List<Aspiration> findAll();
    Aspiration findById(Long id);
    void update(Long id,AspirationRequest Aspiration);
    void delete(Long id);
    Aspiration create(AspirationRequest Aspiration);
}
