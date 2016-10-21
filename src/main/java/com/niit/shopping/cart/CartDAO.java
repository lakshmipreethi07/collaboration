package com.niit.shopping.cart;

import java.util.List;

import com.niit.shopping.model.Cart;
import com.niit.shopping.model.OrderedItems;

public interface CartDAO {

	void saveOrUpdate(Cart cart);
	
	void delete(String cartId);
	
	Cart getCartByCustomerId(String userId);
	
	List<Cart> listCart();
	
	List<OrderedItems> listOrderedItems(String userId);
	
	/*Cart createCart(Cart cart);

	Cart read(String cartId);

	void update(String cartId, Cart cart);

	void delete(String Id);
*/
}
