package com.ibm.practica.spital.repository;

import com.ibm.practica.spital.entity.Pacient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacientRepository extends JpaRepository<Pacient,String> {
    List<Pacient> findPacientByFirstName(String firstName);
}