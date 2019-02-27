package pl.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.website.model.Product;
import pl.website.service.*;

import java.util.List;

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

    @RequestMapping(value = "/clothes", produces = "text/html; charset=UTF-8")
    public String shopClothes(Model model) {
        List<Product> productForClothes = productService.findAllByProductType(productTypeService.findOneProductTypeById((long) 1));
        model.addAttribute("productForClothes",productForClothes);
        return "/shop/clothes";
    }

    @RequestMapping(value = "/acesories", produces = "text/html; charset=UTF-8")
    public String shopAcessories(Model model) {
        model.addAttribute("productForMaty",productService.findAllByProductType(productTypeService.findOneProductTypeById((long) 2)));
        model.addAttribute("productForPiorniki",productService.findAllByProductType(productTypeService.findOneProductTypeById((long) 3)));
        model.addAttribute("productForPlecaki",productService.findAllByProductType(productTypeService.findOneProductTypeById((long) 4)));
        model.addAttribute("productForTorby",productService.findAllByProductType(productTypeService.findOneProductTypeById((long) 5)));
        model.addAttribute("productForNerki",productService.findAllByProductType(productTypeService.findOneProductTypeById((long) 6)));
        return "/shop/acesories";
    }

    @RequestMapping(value = "/productDetail/{id}", produces = "text/html; charset=UTF-8")
    public String itemDetails(@PathVariable Long id, Model model) {
        model.addAttribute("productDetail",productService.findOneProductById(id));
        return "/shop/productDetails";
    }
}
