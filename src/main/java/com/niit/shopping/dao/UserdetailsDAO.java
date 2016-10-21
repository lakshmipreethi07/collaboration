package com.niit.shopping.dao;

import java.security.Principal;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.niit.shopping.model.Userdetails;

@Repository
public interface UserdetailsDAO {
	
	public boolean save(Userdetails userdetails);
	
	public boolean update(Userdetails userdetails);
		
		public boolean delete(Userdetails userdetails);
		
		public Userdetails getCustomerByUserName( String userName);
		public List<Userdetails> list();
				
		public Userdetails isValidUser(String id,String password);

		public Userdetails get(String id);

	
			

}
