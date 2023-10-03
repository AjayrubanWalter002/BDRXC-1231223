package com.Vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Vehicle.entity.Car;

public interface Carrepository  extends JpaRepository<Car, Integer>{
@Query(value="select * from car_detail where brand like ?",nativeQuery = true)
public List<Car> getbyBrand(String name);
}
