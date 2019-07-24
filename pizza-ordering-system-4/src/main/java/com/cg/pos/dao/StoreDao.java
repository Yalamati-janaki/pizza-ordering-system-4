package com.cg.pos.dao;

import com.cg.pos.entity.StoreDetailsDTO;
import com.cg.pos.exceptions.StoreExceptions;

public interface StoreDao {

	int addStore(StoreDetailsDTO storeDetailEntity) throws StoreExceptions;

	StoreDetailsDTO viewStore(StoreDetailsDTO storeDetailsDTO) throws StoreExceptions;

	StoreDetailsDTO deleteStore(StoreDetailsDTO storeDetailEntity1) throws StoreExceptions;

	StoreDetailsDTO modifyStore(StoreDetailsDTO storeDetailsDTO) throws StoreExceptions;

}
