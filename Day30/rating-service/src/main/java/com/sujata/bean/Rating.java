package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Rating {

	@Id
	@Getter
	@Setter
	private int ratingId;
	@Getter
	@Setter
	private String userId;
	@Getter
	@Setter
	private String movieId;
	@Getter
	@Setter
	private int rating;
}
