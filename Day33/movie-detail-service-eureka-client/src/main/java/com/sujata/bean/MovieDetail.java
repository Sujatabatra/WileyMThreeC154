package com.sujata.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class MovieDetail {
	@Setter
	@Getter
	private int ratingId;
	@Setter
	@Getter
	private String userId;
	@Setter
	@Getter
	private String movieName;
	@Setter
	@Getter
	private int rating;

}
