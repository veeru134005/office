package com.veera.back.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.veera.back.daointer.DaoInter;
import com.veera.back.dto.Catagory;

@Repository("categoryDao")
public class Daoimpl implements DaoInter {

	private static List<Catagory> c = new ArrayList<>();

	static {

		Catagory catro = new Catagory();
		//Adding first category
		
		catro.setId(123);
		catro.setDescription("The item may not delete from the try");
		catro.setName("Telivision");
		catro.setImageUrl("hari.jpg");
		
		c.add(catro);

		// catagory 2 catagory
		
		catro = new Catagory();
		catro.setId(124);
		catro.setDescription("The item may not delete from the try");
		catro.setName("Mobile");
		catro.setImageUrl("hari.jpg");
		c.add(catro);
		
		// catrogory 3 catagory
		
		catro = new Catagory();

		catro.setId(125);
		catro.setDescription("The item may not delete from the try");
		catro.setName("Laptop");
		catro.setImageUrl("hari.jpg");

		c.add(catro);
	

	}



	@Override
	public Catagory get(int id) {
		// TODO Auto-generated method stub
		
	 	for(Catagory cata:c)
		{
			if(cata.getId()==id) return cata;
		}
		
		return null;
	}



	@Override
	public List<Catagory> list() {
		// TODO Auto-generated method stub
		return c;
	}

}
