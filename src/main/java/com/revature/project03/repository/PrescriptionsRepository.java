package com.revature.project03.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.project03.entities.Prescriptions;

public interface PrescriptionsRepository extends JpaRepository<Prescriptions,Integer>{
	Prescriptions findByDoctorId(int doctorId);
	List<Prescriptions> findAllByPatientId(int patientId);
}
