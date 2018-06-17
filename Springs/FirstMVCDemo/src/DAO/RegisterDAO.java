package DAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import controller.Register;
import model.RegisterDTO;

public class RegisterDAO {
	public void save(RegisterDTO d)
	{
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tx = ss.beginTransaction();
		ss.save(d);
		tx.commit();
		ss.close();
		sf.close();	
	}
	
	
		
		

	

}
