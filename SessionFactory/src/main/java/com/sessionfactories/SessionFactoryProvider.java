package com.sessionfactories;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryProvider {
public static SessionFactory provideSF() {
	Configuration config=new Configuration();
	config.configure("hibernate.cfg.xml");
	return config.buildSessionFactory();
}
}
