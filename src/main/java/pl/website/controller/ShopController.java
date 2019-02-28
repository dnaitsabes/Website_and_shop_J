package pl.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.website.model.*;
import pl.website.service.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/shop")
@SessionAttributes("cart")
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
    @Autowired
    private Cart cart;

    @ModelAttribute("productSizeTablesAttributes")
    public List<ProductSizeTable> getProductSizeTable(){
        return productSizeTableService.findAllProductSizeTable();
    }
    @ModelAttribute("productDetailsAttributes")
    public List<ProductDetails> getProductDetails(){
        return productDetailsService.findAllProductDetails();
    }
    @ModelAttribute("productsAttributes")

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

    @GetMapping(value = "/productDetail/{id}", produces = "text/html; charset=UTF-8")
    public String itemDetails(@PathVariable Long id, Model model) {
        model.addAttribute("productDetail",productService.findOneProductById(id));
        model.addAttribute("product", new Product());

        return "/shop/productDetails";
    }

    @PostMapping(value = "/productDetail/addToBasket", produces = "text/html; charset=UTF-8")
    public String updateOrder(@ModelAttribute Product product, @RequestParam Integer quantity, Model model) {

        List<CartItem> cartItems = cart.getCartItems();
        CartItem newCartItems = new CartItem(quantity,product,quantity * product.getPrice());
        Integer quantityTest =0;

        if (cartItems !=null) {
            for (CartItem cartItem : cartItems) {
                if (cartItem.getProduct().equals(product)) {
                    quantityTest = cartItem.getQuantity();
                }
            }
            if (quantity != 0) {
                newCartItems.setQuantity(quantityTest + quantity);
            } else {
                cart.addToCart(newCartItems);
            }
        }else {
            cart.addToCart(newCartItems);
        }
        model.addAttribute("cart", cart);

        return "redirect:/shop/basket";
    }

    @RequestMapping(value="/basket", produces = "text/html; charset=UTF-8")
    public String showBasket(Model model, HttpSession sessionCart){


        return "shop/basket";
    }
}
