package com.niit.shopping.cart;

import java.util.List;

import com.niit.shopping.model.OrderedItems;

public interface OrderedItemsDAO {

	void saveOrUpdate(OrderedItems orderedItems );
	
	void delete(String orderedItemId);
	
	List<OrderedItems> listOrderedItems();
}
