package com.cg.pos.entity;

public class PizzaDetailsDTO {
	private String storeName;
	private int itemId;
	private String itemName;
	private int quantity;
	private double price;
	private String addOns;

	public PizzaDetailsDTO(String storeName, int itemId, int qty, double price) {
		super();
		this.storeName = storeName;
		this.itemId = itemId;
		this.quantity = qty;
		this.price = price;
	}

	// Getter and Setter to Access private Member
	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getQty() {
		return quantity;
	}

	public void setQty(int qty) {
		this.quantity = qty;
	}

	@Override
	public String toString() {
		return "PizzaDetails [itemId=" + itemId + ", itemName=" + itemName + ", quantity=" + quantity + ", cost="
				+ price + ", addOns=" + addOns + "]" + '\n';
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAddOns() {
		return addOns;
	}

	public void setAddOns(String addOns) {
		this.addOns = addOns;
	}

}
