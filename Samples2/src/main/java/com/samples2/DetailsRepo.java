package com.samples2;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepo extends JpaRepository<Integer,Details> {

	void saveAll(Details d);

}
