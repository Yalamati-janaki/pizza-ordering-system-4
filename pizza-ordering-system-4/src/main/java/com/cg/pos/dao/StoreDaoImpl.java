package com.cg.pos.dao;

import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.pos.entity.StoreDetailsDTO;
import com.cg.pos.exceptions.StoreExceptions;

/**
 * class for adding, viewing, deleting and modifying the store details in
 * database.
 * 
 * @author trainee
 *
 */
@Repository
@Transactional
public class StoreDaoImpl implements StoreDao {
	/**
	 * method for ADDING the store details to database.
	 * 
	 * @throws StoreExceptions
	 * @throws SQLException
	 */
	@PersistenceContext
	private EntityManager entityManager;

	public int addStore(StoreDetailsDTO storeDetailsDTO) {
		int flag = 0;
		entityManager.persist(storeDetailsDTO);
		StoreDetailsDTO addStore = entityManager.find(StoreDetailsDTO.class, storeDetailsDTO.getStoreId());
		if (addStore != null) {
			flag = 1;
		}
		return flag;
	}

	/**
	 * method for VIEWING store details from database.
	 * 
	 * @throws StoreExceptions
	 * @throws SQLException
	 */

	public StoreDetailsDTO viewStore(StoreDetailsDTO storeDetailsDTO) {
		StoreDetailsDTO viewStore = entityManager.find(StoreDetailsDTO.class, storeDetailsDTO.getStoreId());
		return viewStore;
	}

	public StoreDetailsDTO deleteStore(StoreDetailsDTO storeDetailEntity1) {
		StoreDetailsDTO result;
		result = entityManager.find(StoreDetailsDTO.class, storeDetailEntity1.getStoreId());
		if (result == null) {
			result = storeDetailEntity1;
		}

		entityManager.remove(result);

		return result;
	}

	public StoreDetailsDTO modifyStore(StoreDetailsDTO storeDetailsDTO) {
		StoreDetailsDTO detailsDTO = entityManager.find(StoreDetailsDTO.class, storeDetailsDTO.getStoreId());
		if (detailsDTO != null) {
			if (storeDetailsDTO.getStoreName() != null) {
				
				detailsDTO.setStoreName(storeDetailsDTO.getStoreName());
			} else if (storeDetailsDTO.getStoreAddress() != null) {
				detailsDTO.setStoreAddress(storeDetailsDTO.getStoreAddress());
			} else if (storeDetailsDTO.getStoreContact() != null) {
				detailsDTO.setStoreContact(storeDetailsDTO.getStoreContact());
			} else if (storeDetailsDTO.getOwnerName() != null) {
				detailsDTO.setOwnerName(storeDetailsDTO.getOwnerName());
			}
		}
		return detailsDTO;
	}

}
