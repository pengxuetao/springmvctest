package com.pxt.controller.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import com.pxt.pojo.user.User;
import com.pxt.service.user.UserService;

import junit.framework.TestCase;

public class TestUserHibernate extends TestCase {
	
	public void testAdd() {
		Configuration cfg = new Configuration();
		cfg.configure("conf/hibernate.cfg.xml");

		ServiceRegistry sr = new ServiceRegistryBuilder().applySettings(
				cfg.getProperties()).buildServiceRegistry();
		SessionFactory sessionFactory = cfg.buildSessionFactory(sr);
		Session session = sessionFactory.openSession();
        session.beginTransaction();
        for ( int i=0; i<100; i++ ) {
        	User user = new User();
        	user.setUserid(""+i);
        	user.setUsername("pxt"+i);
        	session.save(user);
		}
        session.getTransaction().commit();
	}

}
