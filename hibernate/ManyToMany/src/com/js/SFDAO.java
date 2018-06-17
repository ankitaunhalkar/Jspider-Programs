package com.js;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SFDAO {
public static void main(String[] args) {
	Configuration c = new Configuration();
	c.configure();
	SessionFactory sf = c.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction tx = ss.beginTransaction();
	/*//one student Many faculty
	
	StudDTO s=new StudDTO();
	s.setSname("Ankita");
	
	FacDTO f1=new FacDTO();
	f1.setFname("Azam");
	
	FacDTO f2=new FacDTO();
	f2.setFname("Shabaz");
	
	List<FacDTO> fl=new ArrayList<FacDTO>();
	fl.add(f1);
	fl.add(f2);
	s.setSlist(fl);
	ss.save(s);
		
	//one faculty Many Student
	FacDTO f=new FacDTO();
	f.setFname("Vilas");
	StudDTO s1=new StudDTO();
	s1.setSname("Shivraj");
	StudDTO s2=new StudDTO();
	s2.setSname("Sayli");
	List<StudDTO> sl=new ArrayList<StudDTO>();
	sl.add(s1);
	sl.add(s2);
	f.setFlist(sl);
	ss.save(f);
	tx.commit();*/
	
	StudDTO s=ss.load(StudDTO.class, 1);
	
	List ls=s.getSlist();
	System.out.println(s.getSname());
	for (Object object : ls) {
		FacDTO ob=(FacDTO) object;
		System.out.println(ob.getFname());
	}
	//System.out.println(s);
	ss.close();
	sf.close();
}
}
