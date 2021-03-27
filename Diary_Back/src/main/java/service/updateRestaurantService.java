package service;

import dto.restaurant;

public interface updateRestaurantService {

    public int postRestaurant_request(restaurant restaurant); // 음식점 등록

    public int putRestaurant_request(restaurant restaurant); // 음식점 정보 수정

    public int postRestaurant(restaurant restaurant); // 음식점 등록

    public int putRestaurant(restaurant restaurant); // 음식점 정보 수정

}
