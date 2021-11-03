package com.sujata.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Rating {

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
