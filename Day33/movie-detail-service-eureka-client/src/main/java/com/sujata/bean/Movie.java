package com.sujata.bean;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Movie {

	@Getter
	@Setter
	private String movieId;
	@Getter
	@Setter
	private String movieName;
}
