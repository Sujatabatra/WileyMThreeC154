package com.chiranjeet.inventoryservice.service;

import com.chiranjeet.inventoryservice.bean.InventoryItem;

public interface InventoryService {
	public InventoryItem getInventoryItemByProductCode (String productCode);
	public int updateInventoryItemQuantityByProductCode(String productCode, int availableQuantity);
}
