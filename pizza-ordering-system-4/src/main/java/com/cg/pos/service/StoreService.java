package com.cg.pos.service;

import com.cg.pos.entity.StoreDetailsDTO;
import com.cg.pos.exceptions.StoreExceptions;

public interface StoreService {
	public String addStoreDetails(StoreDetailsDTO storeDetailEntity) throws StoreExceptions;

	public StoreDetailsDTO deleteStoreDetails(StoreDetailsDTO storeDetailEntity1) throws StoreExceptions;

	public StoreDetailsDTO viewStoreDetails(StoreDetailsDTO storeDetailsDTO) throws StoreExceptions;

	public String modifyStore(StoreDetailsDTO storeDetailsDTO) throws StoreExceptions;

}
