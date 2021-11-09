package com.chiranjeet.inventoryservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chiranjeet.inventoryservice.bean.InventoryItem;
import com.chiranjeet.inventoryservice.exception.ItemNotFound;
import com.chiranjeet.inventoryservice.service.InventoryService;


@RestController
public class InventoryItemController {
	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping(path = "/code/{productCode}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<InventoryItem> getInventoryItemByProductCode (@PathVariable String productCode)  {
		
		InventoryItem  inventory_item= inventoryService.getInventoryItemByProductCode(productCode);
		if(inventory_item == null)
			throw new ItemNotFound("No Product Available");
		
		return new ResponseEntity<InventoryItem>(inventory_item, HttpStatus.FOUND);
	}
	
	@PutMapping(path = "/code/{productCode}/{availableQuantity}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Integer> updateInventoryItemQuantityByProductCode(@PathVariable String productCode,
			@PathVariable int availableQuantity){
		Integer  inventory_item_changed= inventoryService.updateInventoryItemQuantityByProductCode(productCode, availableQuantity);
		if(inventory_item_changed <=0 ) {
			throw new ItemNotFound("No Product Changed");
		}
		return new ResponseEntity<Integer>(inventory_item_changed, HttpStatus.ACCEPTED);
	}
}
