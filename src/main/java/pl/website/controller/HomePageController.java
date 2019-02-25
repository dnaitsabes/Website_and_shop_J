package pl.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(value="/",produces = "text/html; charset=UTF-8")
    public String index(){

        return "/index/index";
    }

}
