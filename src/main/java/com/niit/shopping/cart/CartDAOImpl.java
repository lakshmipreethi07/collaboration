package com.niit.shopping.cart;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shopping.cart.CartDAO;
import com.niit.shopping.model.Cart;
import com.niit.shopping.model.OrderedItems;

@Repository("cartDAO")
public class CartDAOImpl implements CartDAO {

	@Autowired
	SessionFactory sessionFactory;

	public CartDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate(Cart cart) {
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
	}

	@Transactional
	public void delete(String cartId) {
		sessionFactory.getCurrentSession().delete(cartId);

	}

	@Transactional
	public Cart getCartByCustomerId(String userId) {
		String hql = "from Cart where userId=" + "'" + userId + "'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> customerList = query.list();
		if (customerList != null && !customerList.isEmpty())
			return customerList.get(0);

		return null;
	}

	@Transactional
	public List<Cart> listCart() {
		String hql = "from Cart";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<Cart> listOfCarts = query.list();
		return listOfCarts;

	}

	@Transactional
	public List<OrderedItems> listOrderedItems(String userId) {
		String hql = "from OrderedItems where userId="+"'"+userId+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		List<OrderedItems> listOfOrderedItems = query.list();
		return listOfOrderedItems;
	}

	

}
