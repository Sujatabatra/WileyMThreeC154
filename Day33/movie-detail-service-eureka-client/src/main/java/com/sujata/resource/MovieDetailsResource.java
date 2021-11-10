package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.bean.MovieDetailsList;
import com.sujata.service.MovieDetailsService;

@RestController
public class MovieDetailsResource {

	@Autowired
	private MovieDetailsService movieDetailService;
	
	@GetMapping(path = "/movies/details/{uId}",produces = MediaType.APPLICATION_JSON_VALUE)
	public MovieDetailsList getMovieDetailsByUserId(@PathVariable("uId") String userId) {
		return movieDetailService.getMovieDetails(userId);
	}
}
