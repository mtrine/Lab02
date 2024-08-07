package com.example.lab02.repository;

import com.example.lab02.pojo.Aspiration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAspirationRepository extends JpaRepository<Aspiration, Long> {
}
