package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Movie {

	@Getter
	@Setter
	@Id
	private String movieId;
	@Getter
	@Setter
	private String movieName;
}
