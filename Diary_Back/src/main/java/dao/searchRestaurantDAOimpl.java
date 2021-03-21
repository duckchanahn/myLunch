package dao;

import dto.restaurant;
import org.apache.ibatis.annotations.Param;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

public class searchRestaurantDAOimpl implements searchRestaurantDAO{

    // getRestaurantTozipcode

    @Autowired
    private SqlSessionTemplate sqlSession;

    public restaurant getRestaurantTozipcode(String zipcode) {

        // 서울 우편번호는 0으로 시작
        String zipcodeMin = "0" +  Integer.toString(Integer.parseInt(zipcode) - 50);
        String zipcodeMax = "0" +  Integer.toString(Integer.parseInt(zipcode) + 50);

        System.out.println(zipcodeMax + " " + zipcodeMin);

        HashMap<String, String> map = new HashMap<>();
        map.put("zipcodeMin", zipcodeMin);
        map.put("zipcodeMax", zipcodeMax);

        return this.sqlSession.selectOne("mappers.restaurant.getRestaurantTozipcode", map);
    }

}
