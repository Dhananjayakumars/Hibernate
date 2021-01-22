package com.xworkz.hibernate.maven.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.hibernate.maven.CarMDTO;
import com.xworkz.hibernate.singleconnection.SingleSessionFactory;

public class CarMDAOImpl implements CarMDAO {

	
	public void insertCar(CarMDTO carMDTO) {
		Session session = null;
		SessionFactory sessionFactory = null;
		try {
			sessionFactory = SingleSessionFactory.getSingleFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			session.persist(carMDTO);
			session.getTransaction().commit();
			System.out.println("data saved successfully");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (Objects.nonNull(carMDTO)) {
				session.close();
				System.out.println("session closed successfully");
			} else {
				System.out.println("session not closed successfully");
			}
			if (Objects.nonNull(sessionFactory)) {
				System.out.println("sessionFactory is closed sucessfully");
			} else {
				System.out.println("sessionFactory is not closed sucessfully");
			}

		}
		
	}

}
