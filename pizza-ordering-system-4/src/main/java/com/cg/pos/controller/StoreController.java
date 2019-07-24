package com.cg.pos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.pos.entity.StoreDetailsDTO;
import com.cg.pos.exceptions.StoreExceptions;
import com.cg.pos.service.StoreService;

@RestController
@RequestMapping(value = "/store")
public class StoreController {
	@Autowired
	private StoreService service;

	public void setService(StoreService service) {
		this.service = service;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST, consumes = "application/json")
	public String addStore(@RequestBody StoreDetailsDTO storeDetailsDTO) {
		String addResult = "";
		try {
			addResult = service.addStoreDetails(storeDetailsDTO);
		} catch (StoreExceptions e) {
			e.printStackTrace();
		}
		return addResult;
	}

	@RequestMapping(value = "/view/{id}", method = RequestMethod.GET, produces = "application/json")
	public StoreDetailsDTO viewStore(@PathVariable("id") int id) {
		StoreDetailsDTO viewResult = null;
		StoreDetailsDTO storeDetailsDTO = new StoreDetailsDTO();
		storeDetailsDTO.setStoreId(id);
		try {
			viewResult = service.viewStoreDetails(storeDetailsDTO);
		} catch (StoreExceptions e) {
			e.printStackTrace();
		}
		return viewResult;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.PUT, headers = "Accept=application/json")
	public StoreDetailsDTO delete(@RequestBody StoreDetailsDTO storeDetailsDTO) {
		StoreDetailsDTO deleteResult = null;
		try {
			deleteResult = service.deleteStoreDetails(storeDetailsDTO);

		} catch (StoreExceptions e) {
			e.printStackTrace();
		}
		return deleteResult;
	}

	@RequestMapping(value = "/modify", method = RequestMethod.PUT, consumes = "application/json")
	public String modifyStoreName(@RequestBody StoreDetailsDTO storeDetailsDTO) {
		String modifyResult = "";
		try {
			modifyResult = service.modifyStore(storeDetailsDTO);

		} catch (StoreExceptions e) {
			e.printStackTrace();
		}
		return modifyResult;
	}

//	@RequestMapping(value = "/modify/contact", method = RequestMethod.PUT, consumes = "application/json")
//	public String modifyStoreContact(@RequestBody StoreDetailsDTO storeDetailsDTO) {
//		String modifyResult = null;
//		try {
//			modifyResult = service.modifyStore(storeDetailsDTO);
//		} catch (StoreExceptions e) {
//			e.printStackTrace();
//		}
//		return modifyResult;
//	}
//
//	@RequestMapping(value = "/modify/address", method = RequestMethod.PUT, consumes = "application/json")
//	public String modifyStoreAddress(@RequestBody StoreDetailsDTO storeDetailsDTO) {
//		String modifyResult = null;
//		try {
//			modifyResult = service.modifyStore(storeDetailsDTO);
//		} catch (StoreExceptions e) {
//			e.printStackTrace();
//		}
//		return modifyResult;
//	}
//
//	@RequestMapping(value = "/modify/ownername", method = RequestMethod.PUT, consumes = "application/json")
//	public String modifyOwnerName(@RequestBody StoreDetailsDTO storeDetailsDTO) {
//		String modifyResult = null;
//		try {
//			modifyResult = service.modifyStore(storeDetailsDTO);
//		} catch (StoreExceptions e) {
//			e.printStackTrace();
//		}
//		return modifyResult;
//	}
}
