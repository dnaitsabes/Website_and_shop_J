package pl.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.website.model.*;
import pl.website.service.ProductTypeService;
import pl.website.service.UserDetailsService;
import pl.website.service.UserService;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private Cart cart;

    @GetMapping(value = "/confirmOrder", produces = "text/html; charset=UTF-8")
    public String shopCategories(HttpSession sessionCart, Model model) {
     User userLoged= (User) sessionCart.getAttribute("userLoged");

     if (userLoged.getUserDetails() == null){
         model.addAttribute("userDetails", new UserDetails());
     }else {
         model.addAttribute("userDetails", userLoged.getUserDetails() );
     }
        model.addAttribute("cart", cart.getCartItems());

        return "/shop/confirmOrder";
    }
}
