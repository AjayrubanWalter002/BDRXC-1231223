package com.sessionfactories;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
 @PostMapping("/save")
 public String save(@RequestBody User user) {
	 SessionFactory sf= SessionFactoryProvider.provideSF();
	 Session session= sf.openSession();
	 Transaction t=session.beginTransaction();
	 session.save(user);
	 t.commit();
	 sf.close();
	 return "User Detail Saved Successfully";
	 
 }
}
