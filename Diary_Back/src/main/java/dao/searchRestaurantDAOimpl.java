package dao;

import dto.restaurant;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class searchRestaurantDAOimpl implements searchRestaurantDAO{

    // getRestaurantTozipcode

    @Autowired
    private SqlSessionTemplate sqlSession;


    public restaurant getRestaurant_searchTozipcode(HashMap map) {
        return this.sqlSession.selectOne("mappers.restaurant.getRestaurant_searchTozipcode", map);
    }

    @Override
    public List<restaurant> getRestaurant_searchTorestaurantName(String restaurantName) {
        return this.sqlSession.selectList("mappers.restaurant.getRestaurant_searchTorestaurantName", restaurantName);
    }

    @Override
    public List<restaurant> getRestaurant_searchToaddressName(String addressName) {
        return this.sqlSession.selectList("mappers.restaurant.getRestaurant_searchToaddressName", addressName);
    }



}
