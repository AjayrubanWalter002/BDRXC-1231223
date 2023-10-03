package com.schoolfinal;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class ResultDao {
@Autowired
ResultRepository repo;
	public String postResult(List<Result> p1) {
		  repo.saveAll(p1);
		  return "saved";
	}

}
