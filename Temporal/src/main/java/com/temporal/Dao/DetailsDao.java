package com.temporal.Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.temporal.Entity.Details;
import com.temporal.Repository.DetailsRepo;

@Repository
public class DetailsDao {
  @Autowired
  DetailsRepo dr;

public String setDetails1(Details d) {
	        dr.save(d);
	        return "Saved";
}

}
