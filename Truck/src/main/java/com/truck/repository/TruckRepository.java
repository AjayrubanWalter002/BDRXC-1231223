package com.truck.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truck.entity.Truck;

public interface TruckRepository extends JpaRepository<Truck, Integer>{

}
