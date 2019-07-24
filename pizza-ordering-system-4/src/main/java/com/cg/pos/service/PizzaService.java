package com.cg.pos.service;

import java.util.ArrayList;

import com.cg.pos.entity.PizzaDetailsDTO;

public interface PizzaService {
	public boolean viewPizza(String storeName);

	String add(PizzaDetailsDTO pizza);

	ArrayList<PizzaDetailsDTO> view(PizzaDetailsDTO pizzaDetails);

	ArrayList<PizzaDetailsDTO> modifyName(int id, String name);

	ArrayList<PizzaDetailsDTO> modifyQuantity(int id, int quantity);

	ArrayList<PizzaDetailsDTO> modifyCost(int id, double cost);

	String modifyAddOns(int id, String addOns);

	ArrayList<PizzaDetailsDTO> deletePizzaDetails(int pizzaId);
}
