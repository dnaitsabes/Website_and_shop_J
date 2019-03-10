package pl.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.website.model.*;
import pl.website.service.OrderService;
import pl.website.service.ProductTypeService;
import pl.website.service.UserDetailsService;
import pl.website.service.UserService;

import javax.servlet.http.HttpSession;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private UserService userService;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private Cart cart;
    @Autowired
    private OrderService orderService;

    @GetMapping(value = "/confirmOrder", produces = "text/html; charset=UTF-8")
    public String shopOrderConfirm(HttpSession sessionCart, Model model) {
        User userLoged = (User) sessionCart.getAttribute("userLoged");

        if (userLoged.getUserDetails() == null) {
            model.addAttribute("userDetails", new UserDetails());
        } else {
            model.addAttribute("userDetails", userLoged.getUserDetails());
        }
        model.addAttribute("cart", cart.getCartItems());
        model.addAttribute("user", userLoged);

        return "/shop/confirmOrder";
    }

    @PostMapping(value = "/createOrder", produces = "text/html; charset=UTF-8")
    public String updateOrder(@ModelAttribute UserDetails userDetails, HttpSession sessionCart) {
        User userLoged = (User) sessionCart.getAttribute("userLoged");
        userDetailsService.saveUserDetails(userDetails);
        userLoged.setUserDetails(userDetails);
        userService.saveUser(userLoged);

        LocalDate dateNow= LocalDate.now();
        List<CartItem> cartItems = cart.getCartItems();
        List<Product> newProductLists = new ArrayList<>();
        Random random = new Random(10000000);
       String randomNumber= random.toString();
        Double orderSum =0.00;
        if (cartItems.size() != 0) {
            for (CartItem cartItem : cartItems) {
                newProductLists.add(cartItem.getProduct());
                orderSum+=cartItem.getProductSumPrice();
            }
        }
        Order newOrder = new Order(LocalDate.now().toString() + randomNumber, dateNow, orderSum, newProductLists,userLoged);
        orderService.saveOrder(newOrder);
        return "/shop/confirmOrderEnd";
    }
}
