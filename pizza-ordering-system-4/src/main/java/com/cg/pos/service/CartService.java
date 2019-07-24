package com.cg.pos.service;

public interface CartService {
	public boolean addToCart(int itemId, int qty, String storeName);

	public boolean confirmOrder();

	public boolean removeItemFromCart(int cartID);
}
