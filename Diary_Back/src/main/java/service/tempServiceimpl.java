package service;

import dao.tempDAO;
import org.springframework.beans.factory.annotation.Autowired;

public class tempServiceimpl implements tempService{

    @Autowired
    private dao.tempDAO tempDAO;

    public String showCustomerName() {
        return this.tempDAO.showCustomerName();
    }

}
