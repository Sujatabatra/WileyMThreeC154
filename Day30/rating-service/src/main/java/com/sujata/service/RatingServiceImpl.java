package com.sujata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sujata.bean.Ratings;
import com.sujata.persistence.RatingDao;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	private RatingDao ratingDao;
	
	@Override
	public Ratings getRatingByUserId(String userId) {
		Ratings ratings=new Ratings();
		ratings.setRatings(ratingDao.findAllByUserId(userId));
		return ratings;
	}

}
