package com.hibernate.AssignmentOne.service.review;

import com.hibernate.AssignmentOne.entities.Review;
import com.hibernate.AssignmentOne.repository.ReviewRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    ReviewRepo reviewRepo;

    @Override
    public List<Review> getAllReviews() {
        return reviewRepo.findAll();
    }
}
