package controller;

import dto.recipe;
import dto.restaurant;
import dto.reviewRecipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class cookingController {

    @Autowired
    private service.searchRecipeService searchRecipeService;

    @Autowired
    private service.updateRecipeService updateRecipeService;

    @Autowired
    private service.reviewRecipeService reviewRecipeService;

    @RequestMapping(method = RequestMethod.GET, value = "recipes/ingredients/{ingredients}")
    public recipe getRecipe_ingredients(@PathVariable String ingredients) { // 재료 입력하면 재료로 가능한 레시피 검색
        return searchRecipeService.getRecipe_ingredients(ingredients);
    }

    @RequestMapping(method = RequestMethod.GET, value = "recipes/name/{name}")
    public recipe getRecipe_name(@PathVariable String name) { // 메뉴 이름 입력하면 레시피 검색
        return searchRecipeService.getRecipe_name(name);
    }

    @RequestMapping(method = RequestMethod.GET, value = "recipes/keyword/{keyword}")
    public recipe getRecipe_keyword(@PathVariable String keyword) { // 레시피 키워드로 레시피 검색
        return searchRecipeService.getRecipe_keyword(keyword);
    }

    //postRecipe_keyword putRecipe

    @RequestMapping(method = RequestMethod.POST, value = "recipes/{recipes}")
    public recipe postRecipe(@PathVariable recipe recipes) { // 레시피 등록
        return updateRecipeService.postRecipe_keyword(recipes);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "recipes/{recipes}")
    public recipe putRecipe(@PathVariable recipe recipes) { // 레시피 수정
        return updateRecipeService.putRecipe(recipes);
    }

    //getReview postReview putReview

    @RequestMapping(method = RequestMethod.GET, value = "recipes/review/restaurant/id/{id}")
    public List<reviewRecipe> getReview_restaurantId(@PathVariable String id) { // 레스트랑 아이디로 레시피 리뷰 검색
        return reviewRecipeService.getReview_restaurantId(id);
    }

    @RequestMapping(method = RequestMethod.GET, value = "recipes/review/id/{id}")
    public reviewRecipe getReview_reviewId(@PathVariable String id) { // 레스트랑 아이디로 레시피 리뷰 검색
        return reviewRecipeService.getReview_reviewId(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "recipes/review/{review}")
    public reviewRecipe postReview(@PathVariable reviewRecipe review) { // 레시피 리뷰 등록
        return reviewRecipeService.postReview(review);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "recipes/review/{review}")
    public reviewRecipe putReview(@PathVariable reviewRecipe review) { // 레시피 리뷰 수정
        return reviewRecipeService.putReview(review);
    }



}
