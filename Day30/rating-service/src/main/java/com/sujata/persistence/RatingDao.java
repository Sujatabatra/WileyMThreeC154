package com.sujata.persistence;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sujata.bean.Rating;

public interface RatingDao extends JpaRepository<Rating, Integer> {

	List<Rating> findAllByUserId(String userId);
}
