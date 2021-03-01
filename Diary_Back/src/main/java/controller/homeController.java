package controller;

import service.tempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {

@Autowired
    private service.tempService tempService;

    @RequestMapping({"/"})
    public String temp() {

        System.out.println(this.tempService.showCustomerName());

        return "index";
    }

}
