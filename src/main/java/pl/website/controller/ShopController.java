package pl.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.website.service.*;

@Controller
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    private OrderService orderService;
    @Autowired
    private ProductService productService;
    @Autowired
    private ProductCategoryService productCategoryService;
    @Autowired
    private ProductDetailsService productDetailsService;
    @Autowired
    private ProductSizeTableService productSizeTableService;
    @Autowired
    private ProductTypeService productTypeService;


    @GetMapping(value = "/shopCategories", produces = "text/html; charset=UTF-8")
    public String shopCategories() {

        return "/shop/shopCategoriesList";
    }

    @GetMapping(value = "/clothes", produces = "text/html; charset=UTF-8")
    public String shopClothes() {

        return "/shop/clothes";
    }

    @GetMapping(value = "/acesories", produces = "text/html; charset=UTF-8")
    public String shopAcessories() {

        return "/shop/acesories";
    }
}
