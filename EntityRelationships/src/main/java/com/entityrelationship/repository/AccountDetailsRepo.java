package com.entityrelationship.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entityrelationship.entity.AccountDetails;
@Repository
public interface AccountDetailsRepo extends JpaRepository<AccountDetails, Integer>{
 
}
