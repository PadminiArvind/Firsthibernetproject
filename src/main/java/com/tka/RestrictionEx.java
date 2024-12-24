package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
public class RestrictionEx {
	public static void main(String[] args) {
		System.out.println(1);
		Configuration cfg=new Configuration();//
		System.out.println(2);
		cfg.configure();//it is trying to locate hibernet.cfg.xml
		System.out.println(3);
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		System.out.println(4);
		Session session=sessionFactory.openSession();
		Criteria criteria=session.createCriteria(Student.class);
				criteria.add(Restrictions.gt("age", 30));
		        criteria.add(Restrictions.lt("age", 40));
		        List<Student> list=criteria.list();
				for (Student student : list) {
				System.out.println(student);
				}
	}	

}
