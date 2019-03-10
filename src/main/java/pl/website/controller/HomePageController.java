package pl.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.website.model.Newsletter;
import pl.website.service.NewsletterService;

@Controller
public class HomePageController {

    @Autowired
    private NewsletterService newsletterService;

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

    @PostMapping(value = "/Newsletter", produces = "text/html; charset=UTF-8" )
    public String addUserNewsletter(@RequestParam String email){
        Newsletter newsletter = new Newsletter(email);
        newsletterService.saveNewsletter(newsletter);
        return"/";
    }

}
