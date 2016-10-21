package com.niit.shopping.cart;

import com.niit.shopping.model.ShippingAddress;

public interface ShippingAddressDAO {

	void saveOrUpdate(ShippingAddress shippingAddress);
	
	void deleteShippingAddress(String shippingAddressId);
	
	ShippingAddress getShippingAddress(String shippingAddressId);
}
