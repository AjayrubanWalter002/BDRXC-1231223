package com.jdbctemplate.DaoImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.web.bind.annotation.PostMapping;

import com.jdbctemplate.Dao.DetailsDao;
import com.jdbctemplate.Entity.Details;
import java.util.List;
@Repository
public class DetailsDaoImple implements DetailsDao{
	@Autowired
	JdbcTemplate jt;
   public int save(Details d) { 
	   return jt.update("INSERT INTO user_detail(user_name,gender,age)VALUES(?,?,?)",
			   new Object[] {
					 d.getUserName(),d.getGender(),d.getAge()  
			   });
   }
////   public int saveAll(List<Details> s) {
////	   return jt.update("INSERT INTO user_detail(user_name,gender,age)VALUES(?,?,?)",
////			   new Object[] {	
////					   
////	   });
//   }
   public List<Details> findAll(){
	   return jt.query("SELECT * FROM user_detail",new BeanPropertyRowMapper<Details>(Details.class));
   }
   
   public Details findById(int id) {
	   return jt.queryForObject("SELECT * FROM user_detail WHERE id=?",new BeanPropertyRowMapper<Details>(Details.class),id);
	   }
//@Override
//public String deleteById(int id) {
//	jt.update("DELETE FROM user_detail WHERE id= ?",id);
//	// TODO Auto-generated method stub
//	return "Data deleted";
//}
//   
//   public int deleteById(int id) {
//	   return 
//   }

public int update(int id, Details f) {
	
	return jt.update("UPDATE user_detail SET user_name=?,gender=?,age=? WHERE id=?",
			new Object[] {
					f.getUserName(),f.getGender(),f.getAge(),id
			});
}
   
   
   }
