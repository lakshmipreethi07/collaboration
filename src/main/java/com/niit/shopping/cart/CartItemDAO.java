package com.niit.shopping.cart;

import java.util.List;

import com.niit.shopping.model.CartItem;

public interface CartItemDAO {

	void saveOrUpdate(CartItem cartItem);

	void delete(String cartItemId);

	CartItem getCartItem(String cartItemId);

	List<CartItem> getCartItemsByCustomerId(String userId);

	List<CartItem> listCartItems();

}
