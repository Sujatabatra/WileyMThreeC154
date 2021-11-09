package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.bean.InventoryItem;
import com.project.exceptions.InventoryNotFoundException;
import com.project.service.InventoryService;

@RestController
public class InventoryController {

	@Autowired
	private InventoryService inventoryService;
	
	@GetMapping(path = "/code/{productCode}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> getInventoryItemByProductCode (@PathVariable("productCode") String code) {
		InventoryItem item = inventoryService.getInventoryItemByProductCode(code);
		if(item==null)
			throw new InventoryNotFoundException("No inventory with code "+code);
		return ResponseEntity.status(HttpStatus.OK).body(item);

	}
	
	@PutMapping(path = "/code/{productCode}/{availableQuantity}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateInventoryItemQuantityByProductCode(@PathVariable("productCode") String code,@PathVariable("availableQuantity") int quantity) {

		InventoryItem item = inventoryService.updateInventoryItemQuantityByProductCode(code,quantity);
		if(item==null)
			throw new InventoryNotFoundException("No inventory with code "+code);
		return ResponseEntity.status(HttpStatus.OK).body(item);
	}
}
