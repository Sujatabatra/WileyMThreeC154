package com.sujata.bean;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class MovieDetailsList {

	@Getter
	@Setter
	List<MovieDetail> movieDetails;
}
