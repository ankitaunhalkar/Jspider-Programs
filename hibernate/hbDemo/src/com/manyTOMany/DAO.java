package com.manyTOMany;

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
//one doctor many patient
		
	/*	PatientDTO p=new PatientDTO();
		p.setPname("A");
		PatientDTO p1=new PatientDTO();
		p1.setPname("B");
		List<PatientDTO> pl=new ArrayList<PatientDTO>();
		pl.add(p);
		pl.add(p1);
		DoctorDTO d=new DoctorDTO();
		d.setDname("X");
		d.setDlist(pl);
		ss.save(d);
		tx.commit();
		*/
//one patient many doctor
		
		DoctorDTO d1=new DoctorDTO();
		d1.setDname("Y");
		DoctorDTO d2=new DoctorDTO();
		d2.setDname("Z");
		List<DoctorDTO> dl=new ArrayList<DoctorDTO>();
		dl.add(d1);
		dl.add(d2);
		PatientDTO pd=new PatientDTO();
		pd.setPname("C");
		pd.setPlist(dl);
		ss.save(pd);
		tx.commit();
		
		ss.close();
		sf.close();
		
		
		
	}

}
