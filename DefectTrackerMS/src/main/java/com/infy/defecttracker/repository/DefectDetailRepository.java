package com.infy.defecttracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.infy.defecttracker.entity.Defect;

public interface DefectDetailRepository extends JpaRepository<Defect, Long>{
	Defect findById(long id);
}
