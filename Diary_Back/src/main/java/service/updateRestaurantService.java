package service;

import dto.restaurant;

public interface updateRestaurantService {

    public restaurant postRestaurant(restaurant restaurant); // 음식점 등록

    public restaurant putRestaurant(restaurant restaurant); // 음식점 정보 수정

}
