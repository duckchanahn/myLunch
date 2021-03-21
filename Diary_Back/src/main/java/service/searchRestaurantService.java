package service;

import dto.restaurant;

public interface searchRestaurantService {

    public restaurant getRestaurant_searchTozipcode(String zipcode); // 주소로 음식점 받아오기

    public restaurant getRestaurant_searchToname(String address); // 음식점 이름으로 검색

    public restaurant getRestaurant_searchToinfo(String address); // 음식점 정보(위치, 메뉴, 이름, 혼밥, 분위기 등)로 검색


//    public restaurant getRestaurant_searchToName(String address); //

}
