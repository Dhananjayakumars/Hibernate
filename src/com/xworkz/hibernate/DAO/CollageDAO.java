package com.xworkz.hibernate.DAO;

import com.xworkz.hibernate.Collage;

public interface CollageDAO {
	void saveCollage(Collage collage);
	void fetchCollage(int id);
	void updateCollage(int id);

}
