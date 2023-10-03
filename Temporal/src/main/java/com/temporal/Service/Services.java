package com.temporal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.temporal.Dao.DetailsDao;
import com.temporal.Entity.Details;
import com.temporal.Repository.DetailsRepo;

@Service
public class Services {
 @Autowired
 Daos ds;
	public String setDetails1(Details d) {
		return ds.setDetails1(d);
	}



	
}

