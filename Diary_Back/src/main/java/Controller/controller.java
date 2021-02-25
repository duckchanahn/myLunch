package Controller;

import DAO.TempDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by NESOY on 2017-02-04.
 */
@Controller
public class controller {

    @Autowired(required = false)
    private TempDAO tempDAO;

    @RequestMapping(value = "/")
    public String test(){

//        this.tempDAO.select(0);

//        System.out.println(this.tempDAO.select(0));

        return "index";
    }
}