package dao;

import dto.temp;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

public class tempDAOimpl implements tempDAO{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public String showCustomerName() {

        return this.sqlSession.selectOne("mappers.tempCustomer.selectCustomerName");

    }
}
