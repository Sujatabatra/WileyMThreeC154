package com.project.persistence;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.bean.InventoryItem;

@Repository
public interface InventoryDao extends JpaRepository<InventoryItem, String> {

	@Query(value="select c from InventoryItem c where productCode =:cid")
	public InventoryItem getInventoryByCode(@Param("cid")String productCode);

	@Transactional
	@Modifying
	@Query(value="UPDATE InventoryItem SET availableQuantity =:quantity WHERE productCode =:code")
	public int updateInventoryItemQuantityByProductCode(@Param("code")String code, @Param("quantity")int quantity);

}
