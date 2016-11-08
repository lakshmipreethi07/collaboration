package com.niit.dao;



import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Blog;




@EnableTransactionManagement
@Repository("blogDAO")
public class BlogDAOImpl implements BlogDAO {
private static final Logger log = LoggerFactory.getLogger(UserdetailsDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	public BlogDAOImpl(SessionFactory sessionFactory)
	{
	this.sessionFactory = sessionFactory;

	}
@Transactional
	public boolean save(Blog blog)
	{
	try {
		log.debug("starting of save method");
		
		sessionFactory.getCurrentSession().save(blog);
		
		
		log.debug("Ending of save method");
		
		return true;
	}
	catch(Exception e)
	{
		log.error("Exception occured in save" +e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
@Transactional
	public boolean update(Blog blog)
	{
	try {
		log.debug("starting of update method");
		sessionFactory.getCurrentSession().update(blog);
		log.debug("starting of update method");
		return true;
	}
	catch(Exception e)
	{
		log.error("Exception occured in update" +e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
@Transactional
	public boolean delete(String id)
	{
	try {
		log.debug("starting of delete method");
		sessionFactory.getCurrentSession().delete(id);
		log.debug("starting of delete method");
		return true;
	}
	catch(Exception e)
	{
		log.error("Exception occured in delete" +e.getMessage());
		e.printStackTrace();
		return false;
	}
	}
@Transactional
public Blog get(String id)
{
	String hql = "from Blog where id= "+" '" +id+ "'";
	Query query =sessionFactory.getCurrentSession().createQuery(hql);
	List<Blog> list = query.list();
	if(list == null || list.isEmpty())
	{
		return null;
	}
	else
	{
		return list.get(0);
	}
}


@Transactional
public List<Blog> list()
{
	String hql = "from Blog";
	Query query =sessionFactory.getCurrentSession().createQuery(hql);
	return query.list();
}


}
