package com.chiranjeet.inventoryservice.bean;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Service
@NoArgsConstructor
@AllArgsConstructor
public class InventoryItemList {
    private List<InventoryItem> inventoryItems;
}
