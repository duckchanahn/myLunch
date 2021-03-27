package service;

import dto.restaurant;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class updateRestaurantServiceimpl implements updateRestaurantService{

    @Autowired
    private dao.updateRestaurantDAO updateRestaurantDAO;

    @Override
    public int postRestaurant_request(restaurant restaurant) {

        HashMap<String, String> map = addExplanation(restaurant, "postRestaurant_request");

        return this.updateRestaurantDAO.postRestaurant_request(map);
    }

    @Override
    public int putRestaurant_request(restaurant restaurant) {

        HashMap<String, String> map = addExplanation(restaurant, "putRestaurant_request");

        return this.updateRestaurantDAO.putRestaurant_request(map);
    }

    @Override
    public int postRestaurant(restaurant restaurant) {
        return this.updateRestaurantDAO.postRestaurant(restaurant);
    }

    @Override
    public int putRestaurant(restaurant restaurant) {
        return this.updateRestaurantDAO.putRestaurant(restaurant);
    }


    private HashMap addExplanation(restaurant restaurant, String tableName) {

        HashMap<String, String> map = new HashMap<>();

        map.put("address", restaurant.getAddress());
        map.put("restaurantName", restaurant.getRestaurantName());
        map.put("restaurantCondition", restaurant.getRestaurantCondition());
        map.put("tableName", tableName);

        return map;
    }
}
