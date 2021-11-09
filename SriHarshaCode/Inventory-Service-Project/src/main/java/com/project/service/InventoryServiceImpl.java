package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bean.InventoryItem;
import com.project.persistence.InventoryDao;

@Service
public class InventoryServiceImpl implements InventoryService {

	@Autowired
	private InventoryDao inventoryDao;
	@Override
	public InventoryItem getInventoryItemByProductCode(String productCode) {
		return inventoryDao.getInventoryByCode(productCode);
	}
	@Override
	public InventoryItem updateInventoryItemQuantityByProductCode(String code, int quantity) {
		int flag= inventoryDao.updateInventoryItemQuantityByProductCode(code, quantity);
		if(flag>0)
			return inventoryDao.getInventoryByCode(code);
		return null;

	}

}
