package com.electronics;

import static org.junit.jupiter.api.DynamicTest.stream;
import static org.mockito.Mockito.when;

import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.catalina.Group;
import org.apache.catalina.Role;
import org.apache.catalina.User;
import org.apache.catalina.UserDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.electronics.Entity.Electronics;
import com.electronics.Repository.ElectronicsRepo;
import com.electronics.Service.ElectronicsService;

import jakarta.annotation.security.RunAs;

@RunAs(Electronics.class)
@SpringBootTest
public class MockitoTesting  {
     @Autowired
     ElectronicsService ess;
     
     @MockBean
     ElectronicsRepo erp;
     
     
     public void getElecTest() {
    	 when(erp.findAll()).thenReturn(Stream.of(new Electronics(1,"Ac","komatzu",25000)).
     }
     
}
