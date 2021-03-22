package dao;

import dto.restaurant;

import java.util.HashMap;
import java.util.List;

public interface searchRestaurantDAO {

    public restaurant getRestaurantTozipcode(HashMap map);

    public List<restaurant> getRestaurantToname(String name);



}
