package com.cg.pos.entity;

public class CartDetailsDTO {
	private int cartId;
	private int quantity;
	private double restCharges;
	private double delievryCharges;
	private double total;

	// Getter and Setter to Access private Member
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getRestCharges() {
		return restCharges;
	}

	public void setRestCharges(double restCharges) {
		this.restCharges = restCharges;
	}

	public double getDelievryCharges() {
		return delievryCharges;
	}

	public void setDelievryCharges(double delievryCharges) {
		this.delievryCharges = delievryCharges;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "cartId=" + cartId + ", quantity=" + quantity + ", restCharges=" + restCharges + ", delievryCharges="
				+ delievryCharges + ", total=" + total;
	}
}
