package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Entity
public class Wife {

	@Getter
	@Setter
	@Id
	private String wifeId;
	@Getter
	@Setter
	private String wifeName;
	@Getter
	@Setter
	@OneToOne
	private Husband husband;
	public Wife(String wifeId, String wifeName) {
		super();
		this.wifeId = wifeId;
		this.wifeName = wifeName;
	}
	
	
	
}
