package com.jspider.project;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class DAO {
	
@Autowired
SessionFactory sf;
public void save(DTO dto){
	/*Configuration cfg = new Configuration();
	cfg.configure();
	SessionFactory sf = cfg.buildSessionFactory();*/
	Session ss = sf.openSession();
	Transaction tx = ss.beginTransaction();
	ss.save(dto);
	tx.commit();
	ss.close();
	sf.close();	

}
}
