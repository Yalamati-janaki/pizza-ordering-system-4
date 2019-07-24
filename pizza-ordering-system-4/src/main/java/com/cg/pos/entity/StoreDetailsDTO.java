package com.cg.pos.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * DTO class for store details
 * 
 * @author trainee
 *
 */
@Entity
@Table(name = "store")
public class StoreDetailsDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sid")
	@SequenceGenerator(name = "sid", sequenceName = "storeid", initialValue = 10000, allocationSize = 1)
	private int storeId;
	private String storeName;
	private String storeAddress;
	private String storeContact;
	private String ownerName;

	/**
	 * default constructor
	 */
	public StoreDetailsDTO() {

	}

	/**
	 * Parameterized constructor
	 * 
	 * @param storeId
	 * @param storeName
	 * @param storeAddress
	 * @param storeContact
	 * @param ownerName
	 */
	public StoreDetailsDTO(int storeId, String storeName, String storeAddress, String storeContact, String ownerName) {
		super();
		this.storeId = storeId;
		this.storeName = storeName;
		this.storeAddress = storeAddress;
		this.storeContact = storeContact;
		this.ownerName = ownerName;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStoreAddress() {
		return storeAddress;
	}

	public void setStoreAddress(String storeAddress) {
		this.storeAddress = storeAddress;
	}

	public String getStoreContact() {
		return storeContact;
	}

	public void setStoreContact(String storeContact) {
		this.storeContact = storeContact;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return '\n' + "storeId=" + storeId + '\n' + "storeName=" + storeName + '\n' + "storeAddress=" + storeAddress
				+ '\n' + "storeContact=" + storeContact + '\n' + "ownerName=" + ownerName + '\n';
	}

}
