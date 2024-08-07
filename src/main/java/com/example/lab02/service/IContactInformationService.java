package com.example.lab02.service;

import com.example.lab02.dtos.request.ContactInformationRequest;
import com.example.lab02.pojo.ContactInformation;

import java.util.List;

public interface IContactInformationService{
    List<ContactInformation> findAll();
    ContactInformation findById(Long id);
    void update(ContactInformationRequest ContactInformation);
    void delete(Long id);
    ContactInformation create(ContactInformationRequest ContactInformation);
}