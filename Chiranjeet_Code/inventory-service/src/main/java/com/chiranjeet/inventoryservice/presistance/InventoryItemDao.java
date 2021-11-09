package com.chiranjeet.inventoryservice.presistance;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.chiranjeet.inventoryservice.bean.InventoryItem;

public interface InventoryItemDao extends JpaRepository<InventoryItem, Long> {

	InventoryItem findByProductCode(String productCode);
	
	@Modifying
	@Transactional
	@Query("update InventoryItem inv set inv.availableQuantity = ?2 where inv.productCode = ?1")
	int updateByProductCode(String productCode,int availableQuantity);
	
	
}
