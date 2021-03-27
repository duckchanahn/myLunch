package dao;

import dto.restaurant;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;

public class updateRestaurantDAOimpl implements updateRestaurantDAO{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public int postRestaurant_request(HashMap restaurant) {
        return this.sqlSession.insert("mappers.updateRestaurant.postRestaurant_request", restaurant);
    }

    @Override
    public int putRestaurant_request(HashMap restaurant) {
        return this.sqlSession.insert("mappers.updateRestaurant.putRestaurant_request", restaurant);
    }

    @Override
    public int postRestaurant(restaurant restaurant) {
        return this.sqlSession.insert("mappers.updateRestaurant.postRestaurant", restaurant);
    }

    @Override
    public int putRestaurant(restaurant restaurant) {
        return this.sqlSession.update("mappers.updateRestaurant.putRestaurant", restaurant);
    }
}
