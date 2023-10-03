package com.electronics.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.electronics.Entity.*;
public interface ElectronicsRepo extends JpaRepository<Electronics, Integer>{

}
