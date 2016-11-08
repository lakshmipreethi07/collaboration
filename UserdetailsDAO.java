package com.niit.dao;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.model.Userdetails;



public interface UserdetailsDAO {
	
	public boolean save(Userdetails userdetails);
	
	public boolean update(Userdetails userdetails);
		
		public boolean delete(Userdetails userdetails);
		
		
		public List<Userdetails> list();
				
		public Userdetails authenticate(String useri,String password);

		public Userdetails get(String userid);

	
			

}
