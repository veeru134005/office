package com.veera.back.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.veera.back.daointer.DaoInter;
import com.veera.back.dto.Catagory;

@Repository("categoryDao")
@Transactional
public class Daoimpl implements DaoInter {

	@Autowired
	private SessionFactory ses;

	@Override

	// Getting the single values
	public Catagory get(int id) {

		Catagory c = ses.getCurrentSession().get(Catagory.class, Integer.valueOf(id));

		return c;
	}

	@Override
	public List<Catagory> list() {

		return null;
	}

	@Override
	public boolean add(Catagory category) {

		try {
			ses.getCurrentSession().persist(category);
			return true;

		} catch (Exception e) {

			return false;
		}

	}

	@Override
	public boolean update(Catagory category) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Catagory category) {
		// TODO Auto-generated method stub
		return false;
	}

}
