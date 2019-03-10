package pl.website.controller;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pl.website.model.User;
import pl.website.service.UserDetailsService;
import pl.website.service.UserService;

import javax.validation.Valid;
import java.awt.print.Book;
import java.time.LocalDate;

@Controller
@RequestMapping()
@SessionAttributes("userLoged")
public class LoginRegisterController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDetailsService userDetailsService;

    //Redirect to login site
    @GetMapping(value="/login",produces = "text/html; charset=UTF-8")
    public String login(){
        return "/login/login";
    }

    @PostMapping("/login")
    public  String dataFromLogin(@RequestParam String loginEmail, @RequestParam String loginPassword, Model model){
        User userIsLoged =userService.finOneUserByEmail(loginEmail);
        if (BCrypt.checkpw(loginPassword, userIsLoged.getPassword())) {

        model.addAttribute("userLoged",userIsLoged);

        } else {

            return "/login/login";
        }

        return  "redirect:/";
    }


    @GetMapping("/register")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "/login/register";
    }

    @PostMapping(value = "/register", produces = "text/html; charset=UTF-8")
    public String addUser(@Valid User user, BindingResult result) {
        if (result.hasErrors()){
            return "/login/register";
        }
        user.setUserCreatedDate(LocalDate.now());
        userService.saveUser(user);

        return "redirect:/";
    }
}
