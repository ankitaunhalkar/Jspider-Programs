package com.curd_session;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.DTO;

public class SessionDAO {

	public static void main(String[] args) {
		Configuration c=new Configuration();
		c.configure();
		SessionFactory sf=c.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tx=ss.beginTransaction();
		DTO d=new DTO();
		//Create
		/*d.setName("Ankita");
		d.setSalary(40000);
		d.setDesgination("Java Developer");
		ss.save(d);
		tx.commit();*/
		
		//Read
		/*DTO dto=ss.load(DTO.class, 3);
		System.out.println(dto);*/
		
		//Update
		/*DTO dto=ss.load(DTO.class, 3);
		dto.setSalary(dto.getSalary()+3000);
		ss.update(dto);
		tx.commit();*/
		
		//Delete
		DTO dto=ss.load(DTO.class, 3);
		ss.delete(dto);
		tx.commit();
		
		ss.close();
		sf.close();
	}

}
