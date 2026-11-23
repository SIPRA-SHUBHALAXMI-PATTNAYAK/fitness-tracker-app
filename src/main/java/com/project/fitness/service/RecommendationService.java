package com.project.fitness.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.fitness.dto.Recommendationrequest;
import com.project.fitness.model.Activity;
import com.project.fitness.model.Recommendation;
import com.project.fitness.model.User;
import com.project.fitness.repository.ActivityRepository;
import com.project.fitness.repository.RecommendationRepository;
import com.project.fitness.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RecommendationService {

	private final UserRepository userRepository;
	private final ActivityRepository activityRepository;
	private final RecommendationRepository recommendationRepository;
	
	public Recommendation generateRecommendation(Recommendationrequest request) {
		
		User user=userRepository.findById(request.getUserId())
				.orElseThrow(()-> new RuntimeException("User not found "+request.getUserId()));
		
		
		Activity activity=activityRepository.findById(request.getActivityId())
				.orElseThrow(()-> new RuntimeException("Activity not found "+request.getActivityId()));
		
		Recommendation recommendation=Recommendation.builder()
				.user(user)
				.activity(activity)
				.improvements(request.getImprovements())
				.suggestions(request.getSuggestions())
				.safety(request.getSafety())
				.build();
		
		Recommendation saveRecommendation=recommendationRepository.save(recommendation);
		
		return saveRecommendation;
	}

	
	
	public List<Recommendation> getUserRecommendation(String userId) {
		
		return recommendationRepository.findByUserId(userId);
	}



	public List<Recommendation> getActivityRecommendation(String activityId) {
		return recommendationRepository.findByActivityId(activityId);
	}



	

}
