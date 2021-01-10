package com.xworkz.hibernate.tester;

import java.util.Objects;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.hibernate.DAO.CollageDAOImpl;

public class CollageTester {

	/*public static void main(String[] args) {

		Session session = null;
		try {
			Configuration con = new Configuration();
			con.configure();

			SessionFactory sessionFactory = con.buildSessionFactory();
			session = sessionFactory.openSession();
			session.beginTransaction();
			Collage collage = new Collage(2, "AIT", "bengaluru", 1000, 30, 6);
			session.save(collage);
			session.getTransaction().commit();

		} catch (Exception e) {
		} finally {
			if (Objects.nonNull(session)) {
				System.out.println("session is closed");
			} else {
				System.out.println("session not closed");
			}

		}

	}

}*/
	public static void main(String[] args) {
		/* Collage collage = new Collage(05, "acharya", "bengaluru", 900, 80, 8); */
		CollageDAOImpl collageDAOImpl=new CollageDAOImpl();
		/* collageDAOImpl.saveCollage(collage); */
		//collageDAOImpl.fetchCollage(5);
		collageDAOImpl.updateCollage(05);
		collageDAOImpl.fetchCollage(05);
		
		

	}
}

