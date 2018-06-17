package com.oneToOne;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneDAO {
public static void main(String[] args) {
	Configuration conf = new Configuration();
	conf.configure();
	SessionFactory sf = conf.buildSessionFactory();
	Session ss = sf.openSession();
	Transaction t=ss.beginTransaction();
	
	//save one to one object
	
	/*EmployeeDTO e1=new EmployeeDTO();
	e1.setName("jaykrishnan");
	e1.setSalary(1234);
	
	DepartmentDTO d=new DepartmentDTO();
	d.setDept("Test");
	d.setEmp(e1);
	ss.save(d);
	t.commit();
	*/
	
	/////////////////read and update one2one objects////////////////////
	/*
    DepartmentDTO d=ss.load(DepartmentDTO.class, 1);
	EmployeeDTO e=d.getEmp();
	System.out.println(d.getDept()+" "+e.getName());
	e.setSalary(12000);
	d.setDept("developer");
	d.setEmp(e);
	ss.saveOrUpdate(d);
	t.commit();*/
	
	
////////////////////delete one to one object//////////////////////	
	DepartmentDTO d=ss.load(DepartmentDTO.class, 1);
	ss.delete(d);
	t.commit();
	sf.close();
	
	
	
	
}
}
