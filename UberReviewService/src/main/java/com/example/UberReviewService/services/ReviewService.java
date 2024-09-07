package com.example.UberReviewService.services;

import com.example.UberReviewService.models.Review;
import com.example.UberReviewService.repository.ReviewRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
@Service
public class ReviewService implements CommandLineRunner{
    private ReviewRepository reviewRepository;

    public ReviewService(ReviewRepository reviewRepository){
        this.reviewRepository = reviewRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("***********");
        Review r = Review.builder().content("amnbb").rating(4.0).build();
        System.out.println(r);
        reviewRepository.save(r);

    }
}