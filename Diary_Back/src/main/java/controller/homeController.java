package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {





    @Autowired
    private service.tempService tempService;

    @RequestMapping(value = "/")
    public String home() {
        String test = "이게된거야?";
        return "index";
    }

 //   @RequestMapping(method = RequestMethod.GET, value = "/gettemp/{str}", produces = MediaType.APPLICATION_JSON_VALUE)


}
