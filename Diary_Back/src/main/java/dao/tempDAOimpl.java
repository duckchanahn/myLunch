package dao;

import dto.temp;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class tempDAOimpl implements tempDAO{

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public String showCustomerName() {
        return sqlSession.selectOne("mappers.tempCustomer.selectCustomerName");
    }
}
