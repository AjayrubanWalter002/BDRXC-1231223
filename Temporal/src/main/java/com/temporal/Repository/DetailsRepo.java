package com.temporal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.temporal.Entity.Details;
public interface DetailsRepo extends JpaRepository<Integer,Details>{

	void save(Details d);

	

}
