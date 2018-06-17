package com.manyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DAO {

	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure();
	//cfg.addAnnotatedClass(ServerDTO.class);
	//cfg.addAnnotatedClass(ClientDTO.class);
	SessionFactory sf = cfg.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tx = ss.beginTransaction();
	
	ServerDTO s=new ServerDTO();
	s.setSname("Server");
	
	ClientDTO c1=new ClientDTO();
	c1.setCname("A");
	c1.setServer(s);
	
	ClientDTO c2=new ClientDTO();
	c2.setCname("B");
	c2.setServer(s);
	
	ClientDTO c3=new ClientDTO();
	c3.setCname("C");
	c3.setServer(s);
	
	ss.save(c1);
	ss.save(c2);
	ss.save(c3);
	tx.commit();
	ss.close();
	sf.close();

	}

}
