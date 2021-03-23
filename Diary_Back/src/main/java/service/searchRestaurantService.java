package service;

import dto.restaurant;

import java.util.HashMap;
import java.util.List;

public interface searchRestaurantService {

    public restaurant getRestaurant_searchTozipcode(String zipcode); // 우편번호 +-50인 음식점 받아오기

    public List<restaurant> getRestaurant_searchTorestaurantName(String restaurantName); // 음식점 이름으로 검색

    public List<restaurant> getRestaurant_searchToaddressName(String addressName); // 지역 입력하면 음식점 나오도록

    public restaurant getRestaurant_searchToinfo(HashMap restaurantInfo); // 음식점 정보(위치, 메뉴, 이름, 혼밥, 분위기 등)로 검색


//    public restaurant getRestaurant_searchToName(String address); //

}
