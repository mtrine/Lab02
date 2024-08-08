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
    public void update(Long id, ContactInformationRequest request) {
        ContactInformation contactInformation = ContactInformationRepository.findById(id).get();
        contactInformation.setPersonalPhone(request.getPersonalPhone());
        contactInformation.setHomePhone(request.getHomePhone());
        contactInformation.setEmail(request.getEmail());
        contactInformation.setPermanentAddress(request.getPermanentAddress());
        contactInformation.setCityPermanentAddress(contactInformation.getCityPermanentAddress());
        contactInformation.setDistrictPermanentAddress(contactInformation.getDistrictPermanentAddress());
        contactInformation.setWardPermanentAddress(contactInformation.getWardPermanentAddress());
        contactInformation.setTemporaryAddress(request.getTemporaryAddress());
        contactInformation.setCityTemporaryAddress(contactInformation.getCityTemporaryAddress());
        contactInformation.setDistrictTemporaryAddress(contactInformation.getDistrictTemporaryAddress());
        contactInformation.setWardTemporaryAddress(contactInformation.getWardTemporaryAddress());
        ContactInformationRepository.save(contactInformation);


    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public ContactInformation create(ContactInformationRequest request) {
        ContactInformation contactInformation = new ContactInformation();
        contactInformation.setPersonalPhone(request.getPersonalPhone());
        contactInformation.setHomePhone(request.getHomePhone());
        contactInformation.setEmail(request.getEmail());
        contactInformation.setPermanentAddress(request.getPermanentAddress());
        contactInformation.setCityPermanentAddress(contactInformation.getCityPermanentAddress());
        contactInformation.setDistrictPermanentAddress(contactInformation.getDistrictPermanentAddress());
        contactInformation.setWardPermanentAddress(contactInformation.getWardPermanentAddress());
        contactInformation.setTemporaryAddress(request.getTemporaryAddress());
        contactInformation.setCityTemporaryAddress(contactInformation.getCityTemporaryAddress());
        contactInformation.setDistrictTemporaryAddress(contactInformation.getDistrictTemporaryAddress());
        contactInformation.setWardTemporaryAddress(contactInformation.getWardTemporaryAddress());
        return ContactInformationRepository.save(contactInformation);

    }
}