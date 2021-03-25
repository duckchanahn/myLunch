package service;

import dto.reviewRecipe;

import java.util.List;

public interface reviewRecipeService {

    public List<reviewRecipe> getReview_restaurantId(String restaurantId);
    public reviewRecipe getReview_reviewId(String restaurantId);
    public reviewRecipe postReview(reviewRecipe recipe);
    public reviewRecipe putReview(reviewRecipe recipe);

}
