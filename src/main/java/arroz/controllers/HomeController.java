package arroz.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import arroz.models.generic.GenericDAO;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "home/index";
    }
}
