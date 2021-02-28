package controller;

import dao.tempDAO;
import dao.tempDAOimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller
public class homeController {

@Autowired
    private tempDAO tempDAO;

    @RequestMapping({"/"})
    public String temp() {

        System.out.println(tempDAO.showCustomerName());

        return "index";
    }

}
