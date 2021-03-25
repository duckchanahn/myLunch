package service;

import dto.recipe;

public interface searchRecipeService {

    public recipe getRecipe_ingredients(String ingredients);
    public recipe getRecipe_name(String name);
    public recipe getRecipe_keyword(String keyword);

}
