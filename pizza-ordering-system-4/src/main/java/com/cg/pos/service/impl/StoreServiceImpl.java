package com.cg.pos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.pos.dao.StoreDao;
import com.cg.pos.entity.StoreDetailsDTO;
import com.cg.pos.exceptions.StoreExceptions;
import com.cg.pos.service.StoreService;
import com.cg.pos.utility.ExceptionMessages;
import com.cg.pos.utility.ValidateStoreDetails;

/**
 * class for adding, deleting, viewing, modifying the store details.
 * 
 * @author trainee
 *
 */
@Service
public class StoreServiceImpl implements StoreService {
	@Autowired
	private StoreDao storeDao;

	public void setStoreDao(StoreDao storeDao) {
		this.storeDao = storeDao;
	}

	/**
	 * method for adding store details to list.
	 * 
	 * @throws StoreExceptions
	 */
	public String addStoreDetails(StoreDetailsDTO storeDetailEntity) throws StoreExceptions {

		ValidateStoreDetails validateStoreDetails = new ValidateStoreDetails();
		String storeName = storeDetailEntity.getStoreName();
		boolean validatedStorename = validateStoreDetails.isValidName(storeName);

		String storeContact = storeDetailEntity.getStoreContact();
		boolean validatedStoreContact = validateStoreDetails.isValidStoreContact(storeContact);

		String storeAddress = storeDetailEntity.getStoreAddress();
		boolean validatedStoreAddress = validateStoreDetails.isValidStoreAddress(storeAddress);

		String ownerName = storeDetailEntity.getOwnerName();
		boolean validatedOwnerName = validateStoreDetails.isValidName(ownerName);
		int addDetails = 0;
		if (validatedStorename && validatedStoreContact && validatedStoreAddress && validatedOwnerName) {
			addDetails = storeDao.addStore(storeDetailEntity);
			if (addDetails <= 0) {
				throw new StoreExceptions(ExceptionMessages.STORE_NAME_EXISTS);
			}
		}
		return "Your STORE ID is " + storeDetailEntity.getStoreId();
	}

	/**
	 * method for viewing store details.
	 * 
	 * @throws StoreExceptions
	 */

	public StoreDetailsDTO viewStoreDetails(StoreDetailsDTO storeDetailsDTO) throws StoreExceptions {
		StoreDetailsDTO viewDetails = storeDao.viewStore(storeDetailsDTO);
		if (viewDetails == null) {
			throw new StoreExceptions(ExceptionMessages.STORE_NAME_NOT_EXISTS);
		}
		return viewDetails;
	}

	/**
	 * method for modifying store details.
	 * 
	 * @throws StoreExceptions
	 */
	public String modifyStore(StoreDetailsDTO storeDetailsDTO) throws StoreExceptions {

		ValidateStoreDetails validateStoreDetails = null;
		if (validateStoreDetails == null) {
			validateStoreDetails = new ValidateStoreDetails();
		}
		if (storeDetailsDTO.getStoreName() != null) {
			validateStoreDetails.isValidName(storeDetailsDTO.getStoreName());
		} else if (storeDetailsDTO.getStoreContact() != null) {
			validateStoreDetails.isValidStoreContact(storeDetailsDTO.getStoreContact());
		} else if (storeDetailsDTO.getStoreAddress() != null) {
			validateStoreDetails.isValidStoreAddress(storeDetailsDTO.getStoreAddress());
		} else if (storeDetailsDTO.getOwnerName() != null) {
			validateStoreDetails.isValidName(storeDetailsDTO.getOwnerName());
		}
		StoreDetailsDTO modifyDetails = storeDao.modifyStore(storeDetailsDTO);

		if (modifyDetails == null) {
			throw new StoreExceptions(ExceptionMessages.STORE_ID_NOT_EXISTS);
		}
		return "Modified";
	}

	/**
	 * method for deleting store details.
	 * 
	 * @throws StoreExceptions
	 */
	public StoreDetailsDTO deleteStoreDetails(StoreDetailsDTO storeDetailEntity1) throws StoreExceptions {

		StoreDetailsDTO deleteDetails = storeDao.deleteStore(storeDetailEntity1);
		if (deleteDetails == null) {
			throw new StoreExceptions(ExceptionMessages.STORE_NAME_NOT_EXISTS);
		}
		return deleteDetails;
	}

}
