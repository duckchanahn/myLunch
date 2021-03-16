package controller;

import dto.restaurant;
import org.json.simple.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.tempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sun.rmi.runtime.Log;

import java.util.HashMap;
import java.util.Map;

@RestController
public class homeController {

    @Autowired
    private service.searchRestaurantService searchRestaurantService;
    @Autowired
    private service.crawlingZipCodeService crawlingZipCodeService;


    @RequestMapping(method = RequestMethod.GET, value = "getrestaurant/{zipcode}")
    public restaurant getRestaurant(@PathVariable String zipcode) {

        String address = crawlingZipCodeService.addressTozipCode(zipcode);
        restaurant restaurant = searchRestaurantService.searchRestaurant_zipcode(address);

        return restaurant;
    }

 //   @RequestMapping(method = RequestMethod.GET, value = "/gettemp/{str}", produces = MediaType.APPLICATION_JSON_VALUE)


}
