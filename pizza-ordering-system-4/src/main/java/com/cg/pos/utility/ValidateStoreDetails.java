package com.cg.pos.utility;

import com.cg.pos.exceptions.StoreExceptions;

/**
 * class for validating the store details.
 * 
 * @author trainee
 *
 */
public class ValidateStoreDetails {
	/**
	 * method for validating the store name.
	 * 
	 * @param storeName
	 * @return boolean
	 * @throws InValidStoreNameException
	 * @throws StoreExceptions 
	 */
	public boolean isValidName(String storeName) throws StoreExceptions {

		if (!storeName.matches("^[a-zA-Z]*$") || storeName.isEmpty()) {
			throw new StoreExceptions(ExceptionMessages.INVALID_NAME);
		}

		return true;

	}

	/**
	 * method for validating the store address.
	 * 
	 * @param storeAddress
	 * @return boolean
	 * @throws InValidStoreAddressException
	 * @throws StoreExceptions 
	 */
	public boolean isValidStoreAddress(String storeAddress) throws StoreExceptions {

		if (!storeAddress.matches("^[\\\\$#\\\\+{}:\\\\?\\\\.,~@\\\"a-zA-Z0-9 ]+$") || storeAddress.isEmpty()) {
			throw new StoreExceptions(ExceptionMessages.INVALID_ADDRESS);
		}
		return true;

	}

	/**
	 * method for validating the store contact.
	 * 
	 * @param storeContact
	 * @return boolean
	 * @throws InValidStoreContactException
	 * @throws StoreExceptions 
	 */
	public boolean isValidStoreContact(String storeContact) throws StoreExceptions {
		if (!storeContact.matches("[1-9][0-9]{9}") || storeContact.isEmpty()) {
			throw new StoreExceptions(ExceptionMessages.INVALID_CONTACT);
		}

		return true;
	}

//	/**
//	 * method for validating owner name.
//	 * 
//	 * @param ownerName
//	 * @return boolean
//	 * @throws InValidOwnerNameException
//	 * @throws StoreExceptions 
//	 */
//	public boolean isValidOwnerName(String ownerName) throws StoreExceptions {
//
//		if (!(ownerName.matches("^[a-zA-Z]*$")) || ownerName.isEmpty()) {
//			throw new StoreExceptions(ExceptionMessages.INVALID_NAME);
//		}
//		return true;
//	}

	


}
