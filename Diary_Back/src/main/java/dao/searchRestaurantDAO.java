package dao;

import dto.restaurant;

public interface searchRestaurantDAO {

    public restaurant getRestaurantTozipcode(String zipcode);

}
