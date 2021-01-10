package com.xworkz.hibernate.DAO;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.Collage;

public class CollageDAOImpl implements CollageDAO {

	@Override
	public void saveCollage(Collage collage) {
		Session session = null;
		try {

			Configuration con = new Configuration();

			con.configure();
			SessionFactory sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			// session.save(collage);
			session.persist(collage);
			session.getTransaction().commit();
			System.out.println("data saved successfully");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(collage)) {
				session.close();
				System.out.println("session closed");
			} else {
				System.out.println("session not closed");
			}
		}

	}

	@Override
	public void fetchCollage(int id) {
		Session session = null;
		try {
			Configuration con = new Configuration();
			con.configure();
			SessionFactory sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			Collage collage = session.get(Collage.class, id);
			System.out.println(collage);

			System.out.println("Data is fetched");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");

		}

	}

	@Override
	public void updateCollage(int id) {
		Session session = null;
		Collage collage = null;
		try {
			Configuration con = new Configuration();
			con.configure();
			SessionFactory sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			collage = session.get(Collage.class, id);
			collage.setNoOfBranches(10);
			collage.setLocation("bengaluru");
			collage.setNoOfStudent(800);
			session.beginTransaction();
			session.update(collage);
			// session.save(collage);
			session.getTransaction().commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (Objects.nonNull(session)) {
				session.close();
				System.out.println("Session is closed");
			} else
				System.out.println("Session is not closed");

		}

	}
}
