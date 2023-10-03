package com.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.car.entity.Engine;

public interface EngineRepository extends JpaRepository<Engine, Integer>{

}
