package com.example.springdatajpatimetruncate.data.repository;

import com.example.springdatajpatimetruncate.data.entity.SampleObject;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SampleObjectRepository extends JpaRepository<SampleObject, UUID> {
}
