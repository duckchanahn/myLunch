package dao;

import dto.restaurant;

import java.util.HashMap;

public interface updateRestaurantDAO {

    public int postRestaurant_request(HashMap restaurant);

    public int putRestaurant_request(HashMap restaurant);

    public int postRestaurant(restaurant restaurant);

    public int putRestaurant(restaurant restaurant);

}
