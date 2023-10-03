package com.stationeries.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stationeries.entity.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {

}
