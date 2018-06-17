package com.oneToMany;

import java.util.ArrayList;
import java.util.List;

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
		Transaction tx = ss.beginTransaction();
		StudentDTO s1=new StudentDTO();
		s1.setName("Ankita");
		StudentDTO s2=new StudentDTO();
		s2.setName("Jignesh");
		StudentDTO s3=new StudentDTO();
		s3.setName("Raunak");
		List<StudentDTO> li =new ArrayList<StudentDTO>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		FacultyDTO1 f=new FacultyDTO1();
		f.setFname("azam");
		f.setList(li);
		ss.save(f);
		tx.commit();
		
		ss.close();
		sf.close();
		
		
		
	}

}
