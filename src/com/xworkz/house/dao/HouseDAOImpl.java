package com.xworkz.house.dao;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.xworkz.hibernate.singleconnection.SingleSessionFactory;
import com.xworkz.house.dto.HouseDTO;

public class HouseDAOImpl implements HouseDAO {

	SessionFactory sessionFactory = null;

	@Override
	public void insertHouse(HouseDTO houseDTO) {
		Session session = null;

		try {
			sessionFactory = SingleSessionFactory.getSingleFactory();
			session = sessionFactory.openSession();
			System.out.println("session opened");
			session.beginTransaction();
			System.out.println("transaction started");
			session.save(houseDTO);
			System.out.println("save done");
			session.getTransaction().commit();
			System.out.println("data saved successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} 
//		finally {
//			if (Objects.nonNull(houseDTO)) {
//				session.close();
//				System.out.println("session closed successfully");
//			} else {
//				System.out.println("session not closed successfully");
//			}
//		}
//		if (Objects.nonNull(sessionFactory)) {
//			sessionFactory.close();
//			System.out.println("sessionFactory is closed sucessfully");
//		} else {
//			System.out.println("sessionFactory is not closed sucessfully");
//		}

	}

}
