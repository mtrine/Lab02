package com.example.lab02.repository;

import com.example.lab02.pojo.EducationInformation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationInformationRepository extends JpaRepository<EducationInformation, Long> {

}
