package service;

import dto.restaurant;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;

public class searchRestaurantServiceimpl implements searchRestaurantService{

    @Autowired
    private dao.searchRestaurantDAO searchRestaurantDAO;

    @Override
    public restaurant getRestaurant_searchTozipcode(String zipcode) {

        // 서울 우편번호는 0으로 시작
        String zipcodeMin = "0" +  Integer.toString(Integer.parseInt(zipcode) - 50);
        String zipcodeMax = "0" +  Integer.toString(Integer.parseInt(zipcode) + 50);

        System.out.println(zipcodeMax + " " + zipcodeMin);

        HashMap<String, String> map = new HashMap<>();
        map.put("zipcodeMin", zipcodeMin);
        map.put("zipcodeMax", zipcodeMax);

        return this.searchRestaurantDAO.getRestaurant_searchTozipcode(map);
//        return restaurant;
    }

    @Override
    public List<restaurant> getRestaurant_searchTorestaurantName(String restaurantName) {

        restaurantName = "%" + restaurantName + "%";

        return this.searchRestaurantDAO.getRestaurant_searchTorestaurantName(restaurantName);
    }

    @Override
    public List<restaurant> getRestaurant_searchToaddressName(String addressName) {

        addressName = "%" + addressName + "%";

        return this.searchRestaurantDAO.getRestaurant_searchToaddressName(addressName);
    }

    @Override
    public restaurant getRestaurant_searchToinfo(HashMap restaurantInfo) {

        restaurant restaurant = new restaurant();

        return restaurant;
    }

}
