package com.example.lab02.repository;

import com.example.lab02.pojo.ContactInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IContactInformationRepository extends JpaRepository<ContactInformation, Long> {
}
