package com.uploadfiles;

import java.io.File;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface FileRepository extends JpaRepository<FileEntity,Integer>{

		
	}

		
	

