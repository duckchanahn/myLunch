package controller;


import dto.restaurant;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
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


    @RequestMapping(method = RequestMethod.GET, value = "getrestaurant/{address}")
    public restaurant getRestaurant(@PathVariable String address) {

        //String address = crawlingZipCodeService.addressTozipCode(zipcode);

        MultiValueMap<String, Object> params = new LinkedMultiValueMap<>();
        params.add("confmKey", "devU01TX0FVVEgyMDIxMDMxODE4NDAxMzExMDkzNzc=");
        params.add("currentPage", 1);
        params.add("countPerPage", 5);
        params.add("keyword", address);
        params.add("resultType", "json");

        RestTemplate juso = new RestTemplate();
        String juso_result = juso.postForObject(
                "https://www.juso.go.kr/addrlink/addrLinkApi.do",
                params,
                String.class
                );

//        System.out.println(juso_result);
        JSONParser parser = new JSONParser();
        JSONObject juso_json = null;
        try {
            Object obj = parser.parse(juso_result);

            juso_json = (JSONObject) obj;
        } catch (Exception e) {e.printStackTrace();}

        JSONObject issues3 = (JSONObject) juso_json.get("results");
        JSONArray issues = (JSONArray) issues3.get("juso");
        JSONObject issues0 = (JSONObject) issues.get(0);

        String zipcode = (String)issues0.get("zipNo");

        System.out.println("address : " + address + '\n' + "우편번호 : " + (String)issues0.get("zipNo"));

//        System.out.println(json_result);

        restaurant restaurant = searchRestaurantService.searchRestaurant_zipcode(zipcode);

        return restaurant;
    }

 //   @RequestMapping(method = RequestMethod.GET, value = "/gettemp/{str}", produces = MediaType.APPLICATION_JSON_VALUE)


}
