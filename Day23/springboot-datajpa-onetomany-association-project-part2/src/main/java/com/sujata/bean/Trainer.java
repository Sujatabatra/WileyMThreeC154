package com.sujata.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
	@Setter
	@Getter
	@OneToMany
	private List<Student> students=new ArrayList<>();
	public Trainer(String trainerId, String trainerName) {
		super();
		this.trainerId = trainerId;
		this.trainerName = trainerName;
	}
	
	
}
