package com.curd_session;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.DTO;

public class HCQLDemo {

	public static void main(String[] args) {
	Configuration c = new Configuration();
	c.configure();
	SessionFactory sf = c.buildSessionFactory();
	Session ss = sf.openSession();
	//Transaction tx = ss.beginTransaction();//no need of this, cz there are methods to fetch in hcql
	Criteria cr=ss.createCriteria(DTO.class);
	cr.add(Restrictions.gt("salary", 5000.0));
	cr.addOrder(Order.desc("salary"));
	List list=cr.list();
	for (Object object : list) {
		System.out.println(object);
	}
	}

}
