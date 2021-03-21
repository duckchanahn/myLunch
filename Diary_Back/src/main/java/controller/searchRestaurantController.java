package controller;

import dto.restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class searchRestaurantController {

    @Autowired
    private service.searchRestaurantService searchRestaurantService;

    @RequestMapping(method = RequestMethod.GET, value = "getrestauranttoaddress/{address}")
    public restaurant getRestaurant_zipcode(@PathVariable String address) { // 주소 기준으로 기준 없이 랜덤

        System.out.println(address);

        restaurant restaurant = searchRestaurantService.getRestaurant_searchTozipcode(address);

        return restaurant;
    }


    @RequestMapping(method = RequestMethod.GET, value = "getrestauranttorestaurantname/{restaurantname}")
    public restaurant getRestaurant_searchToName(@PathVariable String restaurantname) { // 주소 기준으로 기준 없이 랜덤

        restaurant restaurant = searchRestaurantService.getRestaurant_searchToname(restaurantname);

        return restaurant;
    }

}
