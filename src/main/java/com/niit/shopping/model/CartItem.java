package com.niit.shopping.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

@Entity
@Component
public class CartItem implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;	
	@Id
	private String cartItemId;
	
	private String cartId;
	private String userId;
	private String productId;
	

	private int quantity;
	private double totalPrice;
	
	
	
	/*@Transient
	Product product;
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}*/
	
	
	
	
	

	public String getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	
	

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	

	public CartItem() {
		this.cartItemId ="CRTITEM" +UUID.randomUUID().toString().substring(24).toUpperCase();
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	/*
	 * private Product product; private int quantity; private double totalPrice;
	 * 
	 * public Product getProduct() { return product; }
	 * 
	 * public void setProduct(Product product) { this.product = product; }
	 * 
	 * public int getQuantity() { return quantity; }
	 * 
	 * public void setQuantity(int quantity) { this.quantity = quantity; }
	 * 
	 * public double getTotalPrice() { return totalPrice; }
	 * 
	 * 
	 * 
	 * public void setTotalPrice(double totalPrice) { this.totalPrice =
	 * totalPrice; }
	 * 
	 * public CartItem(){}
	 * 
	 * public CartItem(Product product, int quantity, double totalPrice) {
	 * this.product = product; this.quantity = quantity; this.totalPrice =
	 * totalPrice; }
	 */

}
