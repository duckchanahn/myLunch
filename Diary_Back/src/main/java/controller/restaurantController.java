package controller;

import dto.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class restaurantController {

    @Autowired
    private service.searchRestaurantService searchRestaurantService;

    @Autowired
    private service.updateRestaurantService updateRestaurantService;

    @RequestMapping(method = RequestMethod.GET, value = "user/address/{address}/restaurant/recommend")
    public restaurant getRestaurant_zipcode(@PathVariable String address) { // 주소 기준으로 기준 없이 랜덤
        return searchRestaurantService.getRestaurant_searchTozipcode(address);
    }


    @RequestMapping(method = RequestMethod.GET, value = "restaurants/name/{restaurantname}/restaurants")
    public List<restaurant> getRestaurantTorestaurantName(@PathVariable String restaurantname) { // 주소 기준으로 기준 없이 랜덤
        return searchRestaurantService.getRestaurant_searchTorestaurantName(restaurantname);
    }

    @RequestMapping(method = RequestMethod.GET, value = "address/{address}/restaurants")
    public List<restaurant> getRestaurantToaddressName(@PathVariable String address) { // 주소 기준으로 기준 없이 랜덤
        return searchRestaurantService.getRestaurant_searchToaddressName(address);
    }

    @RequestMapping(method = RequestMethod.POST, value = "restaurants/")
    public restaurant postRestaurant_zipcode(@PathVariable String address) { // 새로운 음식점 추가가

        return null;
    }

}
