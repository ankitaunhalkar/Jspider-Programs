package com.curd_session;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import com.DTO;

public class HQLDAO {

	public static void main(String[] args) {
		Configuration c = new Configuration();
		c.configure();
		SessionFactory sf = c.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		//1.READ
		//Get only one object
		/*//1.Create Query or Prepare Query
		Query query=ss.createQuery("from DTO where eid=2");
		
		//2.Process the Query
		DTO dto=(DTO)query.uniqueResult();
		System.out.println(dto);*/
		
		//Get multiply/list of object
		/*Query query=ss.createQuery("from DTO");
		List listofdto=query.list();
		Iterator i=listofdto.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());		
		}*/
		
		//2.UPDATE
		/*Query query=ss.createQuery("update DTO set salary=salary+3000");
		int roweffect=query.executeUpdate();
		System.out.println("Row Effected: "+roweffect);
		tx.commit();*/
		
		//3.DELETE
		/*Query query=ss.createQuery("delete from DTO");
		int roweffect=query.executeUpdate();
		System.out.println("Row Effected: "+roweffect);
		tx.commit();*/
		
		//4.setParameter(param name,value)
		Query query=ss.createQuery("delete from DTO where id=:id");
		//query.setParameter(0, 3);//where id=?
		query.setParameter("id", 2);
		int roweffect=query.executeUpdate();
		System.out.println("Row Effected: "+roweffect);
		tx.commit();
		
		ss.close();
		sf.close();
	}

}
