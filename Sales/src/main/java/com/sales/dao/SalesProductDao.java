package com.sales.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sales.entity.SalesProduct;
import com.sales.repository.SalesProductRepository;

@Repository
public class SalesProductDao {
@Autowired
SalesProductRepository ssr;
public String setSalesProduct(List<SalesProduct> product1) {
      ssr.saveAll(product1);
      return "Saved Successfully";
}

	
}
