package com.chiranjeet.catalog_service.bean;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Component
public class Product {
    private Long id;
    private String code;
    private String name;
    private String description;
    private double price;
}