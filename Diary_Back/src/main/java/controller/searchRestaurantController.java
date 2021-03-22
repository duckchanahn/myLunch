package controller;

import dto.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class searchRestaurantController {

    @Autowired
    private service.searchRestaurantService searchRestaurantService;

    @Autowired
    private service.updateRestaurantService updateRestaurantService;

    @RequestMapping(method = RequestMethod.GET, value = "addresses/{address}/restaurants")
    public restaurant getRestaurant_zipcode(@PathVariable String address) { // 주소 기준으로 기준 없이 랜덤

        restaurant restaurant = searchRestaurantService.getRestaurant_searchTozipcode(address);

        return restaurant;
    }


    @RequestMapping(method = RequestMethod.GET, value = "names/{restaurantname}/restaurants")
    public List<restaurant> getRestaurant_searchToName(@PathVariable String restaurantname) { // 주소 기준으로 기준 없이 랜덤

        List<restaurant> restaurant = searchRestaurantService.getRestaurant_searchToname(restaurantname);

        return restaurant;
    }

    @RequestMapping(method = RequestMethod.POST, value = "restaurants/")
    public restaurant postRestaurant_zipcode(@PathVariable String address) { // 새로운 음식점 추가가

        return null;
    }

}
