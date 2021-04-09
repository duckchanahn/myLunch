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

    @Autowired
    private service.zipcodeService zipcodeService;

    @RequestMapping(method = RequestMethod.GET, value = "user/address/{address}/restaurant/recommend")
    public restaurant getRestaurant_zipcode(@PathVariable String address) { // 기준 없이  주소 랜덤

        String zipcode = this.zipcodeService.addressTozipCode(address);

        return searchRestaurantService.getRestaurant_searchTozipcode(zipcode);
    }


    @RequestMapping(method = RequestMethod.GET, value = "restaurants/name/{restaurantname}/restaurants")
    public List<restaurant> getRestaurant_restaurantName(@PathVariable String restaurantname) { // 레스토랑 이름 일부 검색
        return searchRestaurantService.getRestaurant_searchTorestaurantName(restaurantname);
    }

    @RequestMapping(method = RequestMethod.GET, value = "address/{address}/restaurants")
    public List<restaurant> getRestaurant_addressName(@PathVariable String address) { // 주소 기준으로 기준 없이 랜덤
        return searchRestaurantService.getRestaurant_searchToaddressName(address);
    }

    @RequestMapping(method = RequestMethod.POST, value = "restaurants/{restaurant}/requests")
    public int postRestaurant_request(@PathVariable restaurant restaurant) { // 새로운 음식점 추가
        return updateRestaurantService.postRestaurant_request(restaurant);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "restaurants/{restaurant}/requests")
    public int putRestaurant_request(@PathVariable restaurant restaurant) { // 새로운 음식점 추가
        return updateRestaurantService.putRestaurant_request(restaurant);
    }

    @RequestMapping(method = RequestMethod.POST, value = "restaurants/{restaurant}")
    public int postRestaurant(@PathVariable restaurant restaurant) { // 새로운 음식점 추가
        String zipcode = this.zipcodeService.addressTozipCode(restaurant.getRestaurant_address());

        restaurant.setRestaurant_zipcode(zipcode);

        return updateRestaurantService.postRestaurant(restaurant);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "restaurants/{restaurant}")
    public int putRestaurant(@PathVariable restaurant restaurant) { // 새로운 음식점 추가
        return updateRestaurantService.putRestaurant(restaurant);
    }

}
