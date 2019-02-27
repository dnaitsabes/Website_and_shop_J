package pl.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomePageController {

    @GetMapping(value = "/", produces = "text/html; charset=UTF-8")
    public String index() {

        return "/index/index";
    }

    @GetMapping(value = "/admin/adminMain", produces = "text/html; charset=UTF-8")
    public String adminMain() {

        return "/admin/adminMain";
    }

    @GetMapping(value = "/workshop", produces = "text/html; charset=UTF-8")
    public String workshop() {

        return "/index/workshop";
    }

    @GetMapping(value = "/regulations", produces = "text/html; charset=UTF-8")
    public String regulations() {

        return "/index/regulations";
    }
    @GetMapping(value="/contactDetails",produces = "text/html; charset=UTF-8")
    public String contactDetails(){

        return "/index/contactDetails";
    }



}
