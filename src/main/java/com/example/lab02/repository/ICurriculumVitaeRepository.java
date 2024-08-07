package com.example.lab02.repository;

import com.example.lab02.pojo.CurriculumVitae;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICurriculumVitaeRepository extends JpaRepository<CurriculumVitae, Long> {
}
