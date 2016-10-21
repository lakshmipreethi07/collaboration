package com.niit.shopping.cart;

import java.util.List;

import com.niit.shopping.model.OrderDetail;

public interface OrderDetailDAO {

	void saveOrUpdate(OrderDetail orderDetail);

	void delete(String orderDetailId);

	List<OrderDetail> listOrderDetails();

}
