package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class DAO {

	public static void main(String[] args) {
	Configuration c = new Configuration();
	c.configure();
	SessionFactory sf = c.buildSessionFactory();
	Session ss = sf.openSession();
	DTO d=new DTO();
	d.setName("Raunak");
	d.setSalary(50000);
	d.setDesgination("Java Developer");
	ss.save(d);
	Transaction tx = ss.beginTransaction();
	tx.commit();

	}

}
