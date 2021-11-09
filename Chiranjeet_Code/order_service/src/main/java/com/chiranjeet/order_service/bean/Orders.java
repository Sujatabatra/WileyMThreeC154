package com.chiranjeet.order_service.bean;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Orders {
	@Id
    private Long id;
    private String customerEmail;
    private String customerAddress;
    
    @OneToMany(mappedBy = "orders",cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JsonManagedReference
	@JsonIgnore
    private Set<OrderItem> items;
}
