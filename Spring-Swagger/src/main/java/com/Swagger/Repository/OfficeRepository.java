package com.Swagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Swagger.Entity.Office;
public interface OfficeRepository extends JpaRepository<Office,Integer> {

}
