package com.garment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garment.entity.Garment;

public interface GarmentRepository extends JpaRepository<Garment, Integer>{

}
