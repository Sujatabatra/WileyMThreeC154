package com.chiranjeet.order_service.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class InventoryItem {
	@Id
    private Long id;
    private String productCode;
    private Integer availableQuantity ;
}
