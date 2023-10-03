package com.Vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.Vehicle.entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer>{

	@Query(value="select * from bike_detail where brand like ?",nativeQuery=true)
	public List<Bike> getbyBrand(String name);
    @Query(value="select *from bike_detail where price = ?",nativeQuery=true)
	public List<Bike> getbyprice(int a);
    @Query(value="select * from bike_detail where model like ?",nativeQuery=true)
	public List<Bike> getsbyModel(String g);
    @Query(value="select * from bike_detail where price > ? and price < ?",nativeQuery=true)
	public List<Bike> getpriceRange(int num1, int num2);
    @Query(value = "select * from bike_detail where price= (select max(price) from bike_detail) ",nativeQuery=true)
	public List<Bike> findmaxPrice();
    @Query(value="select * from bike_detail order by price desc ",nativeQuery=true)
	public List<Bike> orderByMax();
    @Query(value="select brand from bike_detail",nativeQuery=true)
    public List<String> selectBrand();
    @Query(value="select price from bike_detail",nativeQuery=true)
	public List<Integer> selectPrice();
    @Query(value="select brand,price from bike_detail",nativeQuery=true)
	public List<String> priceBrand();
    

}
