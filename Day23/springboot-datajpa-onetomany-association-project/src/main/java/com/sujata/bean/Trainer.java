package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Entity
public class Trainer {

	@Setter
	@Getter
	@Id
	private String trainerId;
	@Setter
	@Getter
	private String trainerName;
	public Trainer(String trainerId, String trainerName) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}
	
	
}
