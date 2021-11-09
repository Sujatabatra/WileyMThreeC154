package com.chiranjeet.inventoryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chiranjeet.inventoryservice.bean.InventoryItem;
import com.chiranjeet.inventoryservice.presistance.InventoryItemDao;

@Service
public class InventoryServiceImpl implements InventoryService {
	@Autowired
	private InventoryItemDao inventoryItemDao;
	@Override
	public InventoryItem getInventoryItemByProductCode(String productCode) {
		return inventoryItemDao.findByProductCode(productCode);
	}

	@Override
	public int updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity) {
		return inventoryItemDao.updateByProductCode(productCode,availableQuantity);
	}

}
