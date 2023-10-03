package com.sales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sales.entity.SalesProduct;

public interface SalesProductRepository extends JpaRepository<SalesProduct,Integer>{

}
