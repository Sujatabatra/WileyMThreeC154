package com.project.bean;

import java.util.List;

public class InventoryItemList {

	 private List<InventoryItem> inventoryItems;
	 public InventoryItemList() {
		 
	 }
	public InventoryItemList(List<InventoryItem> inventoryItems) {
		super();
		this.inventoryItems = inventoryItems;
	}
	public List<InventoryItem> getInventoryItems() {
		return inventoryItems;
	}
	public void setInventoryItems(List<InventoryItem> inventoryItems) {
		this.inventoryItems = inventoryItems;
	}
	 
}
