package DAO;

import DTO.Temp;

import java.util.HashMap;
import java.util.List;

public interface TempDAO {

    public int signUp(HashMap<String, Object> pmap);
    public List<Temp> select(int id);

}
