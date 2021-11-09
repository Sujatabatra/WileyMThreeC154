package com.project.service;

import com.project.bean.InventoryItem;

public interface InventoryService {

	public InventoryItem getInventoryItemByProductCode (String productCode);

	public InventoryItem updateInventoryItemQuantityByProductCode(String code, int quantity);
	

	
}
