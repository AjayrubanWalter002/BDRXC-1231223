package com.jdbctemplate.Dao;
import com.jdbctemplate.Entity.*;
import java.util.List;
public interface DetailsDao {
  public int save(Details d);
//  public int save(List<Details> s);
  public List<Details> findAll();
  public Details findById(int id);
//  public String deleteById(int id);
  public int update(int id,Details f);
}
