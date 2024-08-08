package com.example.lab02.controller;

import com.example.lab02.dtos.request.ContactInformationRequest;
import com.example.lab02.pojo.ContactInformation;
import com.example.lab02.service.ContactInformationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/contactinformations")
public class ContactInformationController {

    private ContactInformationService contactInformationService;

    public ContactInformation create(ContactInformationRequest request) {
        return contactInformationService.create(request);
    }

}
