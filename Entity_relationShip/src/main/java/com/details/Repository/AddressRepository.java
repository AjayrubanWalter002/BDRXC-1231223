package com.details.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.details.Entity.Address;

public interface AddressRepository extends JpaRepository<Address,Integer> {

}
