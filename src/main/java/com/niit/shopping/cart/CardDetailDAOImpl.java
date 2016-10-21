package com.niit.shopping.cart;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopping.cart.CardDetailDAO;
import com.niit.shopping.model.CardDetail;

@Repository("cardDetailDAO")
public class CardDetailDAOImpl implements CardDetailDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public CardDetailDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public void saveOrUpdate(CardDetail cardDetail) {
	sessionFactory.getCurrentSession().saveOrUpdate(cardDetail);

	}

}
