package org.sid.spingmvc.dao;

import java.awt.print.Pageable;

import org.sid.spingmvc.entities.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
	public Page<Patient> findByNameContains(String mc, 
			org.springframework.data.domain.Pageable pageable);
}
