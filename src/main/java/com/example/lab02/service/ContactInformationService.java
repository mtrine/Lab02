package com.example.lab02.service;

import com.example.lab02.dtos.request.ContactInformationRequest;
import com.example.lab02.pojo.ContactInformation;
import com.example.lab02.repository.IContactInformationRepository;

import java.util.List;

public class ContactInformationService implements IContactInformationService {
    private IContactInformationRepository ContactInformationRepository;
    @Override
    public List<ContactInformation> findAll() {
        return ContactInformationRepository.findAll();
    }

    @Override
    public ContactInformation findById(Long id) {
        return ContactInformationRepository.findById(id).get();
    }

    @Override
    public void update(ContactInformationRequest ContactInformation) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ContactInformation create(ContactInformationRequest ContactInformation) {
        return new ContactInformation();
    }
}