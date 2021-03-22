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


    public restaurant getRestaurantTozipcode(HashMap map) {


        return this.sqlSession.selectOne("mappers.restaurant.getRestaurantTozipcode", map);
    }

    @Override
//    public List<restaurant> getRestaurantToname(String name) {
    public List<restaurant> getRestaurantToname(String name) {
        String likeName = "'%" + name + "%'";

        System.out.println(likeName);

        System.out.println(this.sqlSession.selectList("mappers.restaurant.getRestaurantToname", likeName).toString());

        return this.sqlSession.selectList("mappers.restaurant.getRestaurantToname", likeName);
    }

}
