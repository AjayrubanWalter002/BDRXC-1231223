package com.shirt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shirt.entity.Shirt;

public interface ShirtRepository extends JpaRepository<Shirt, Integer>{

}
