package DAO;

import DTO.Temp;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class TempDAOimpl implements TempDAO {

    @Autowired
    private SqlSessionTemplate sqlSession;

    @Override
    public int signUp(HashMap<String, Object> pmap) {

        return 0;
    }

    @Override
    public List<Temp> select(int id) {
        return this.sqlSession.selectList("getID");
    }
}
