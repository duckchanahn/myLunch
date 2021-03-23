package dao;

import dto.restaurant;

import java.util.HashMap;
import java.util.List;

public interface searchRestaurantDAO {

    public restaurant getRestaurant_searchTozipcode(HashMap map);

    public List<restaurant> getRestaurant_searchTorestaurantName(String restaurantName);

    public List<restaurant> getRestaurant_searchToaddressName(String addressName);

}
