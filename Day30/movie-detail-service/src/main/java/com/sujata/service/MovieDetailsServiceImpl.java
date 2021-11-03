package com.sujata.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.sujata.bean.Movie;
import com.sujata.bean.MovieDetail;
import com.sujata.bean.MovieDetailsList;
import com.sujata.bean.Rating;
import com.sujata.bean.Ratings;

@Service
public class MovieDetailsServiceImpl implements MovieDetailsService {

	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public MovieDetailsList getMovieDetails(String userId) {
		Ratings ratings=restTemplate.getForObject("http://localhost:8084/ratings/"+userId, Ratings.class);
		List<MovieDetail> movieDetails=new ArrayList<MovieDetail>();
		for(Rating rating:ratings.getRatings()) {
			Movie movie=restTemplate.getForObject("http://localhost:8082/movies/"+rating.getMovieId(), Movie.class);
			MovieDetail movieDetail=new MovieDetail(rating.getRating(), rating.getUserId(), movie.getMovieName(), rating.getRating());
			movieDetails.add(movieDetail);
		}
		return new MovieDetailsList(movieDetails);
	}

}
