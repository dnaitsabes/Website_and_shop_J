package pl.website.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pl.website.model.*;
import pl.website.service.*;

import javax.validation.Valid;
import java.awt.print.Book;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private NewsletterService newsletterService;
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
    private SiteDataService siteDataService;
    @Autowired
    private UserService userService;
    @Autowired
    private UserDetailsService userDetailsService;

    /*ADMIN SHOW ALL CONTROLLERS !!!*/

    //Show all orders
    @RequestMapping(value = "/ordersList", produces = "text/html; charset=UTF-8")
    public String showAllOrders(Model model){
        model.addAttribute("ordersList",orderService.findAllOrder());
        return "/admin/order/adminListOrders";
    }
    //Show all ProductCategories
    @RequestMapping(value = "/productCategoriesList", produces = "text/html; charset=UTF-8")
    public String showAllProductCategories(Model model){
        model.addAttribute("productCategoriesList",productCategoryService.findAllProductCategory());
        return "/admin/order/adminListProductCategories";
    }
    //Show all ProductDetails
    @RequestMapping(value = "/productsDetailsList", produces = "text/html; charset=UTF-8")
    public String showAllProductDetails(Model model){
        model.addAttribute("productsDetailsList",productDetailsService.findAllProductDetails());
        return "/admin/product/lists/adminListProductDetails";
    }
    //Show all Products
    @RequestMapping(value = "/productsList", produces = "text/html; charset=UTF-8")
    public String showAllProducts(Model model){
        model.addAttribute("productsList",productService.findAllProduct());
        return "/admin/product/lists/adminListProducts";
    }
    //Show all ProductSizeTable
    @RequestMapping(value = "/productSizeTableList", produces = "text/html; charset=UTF-8")
    public String showAllProductSizeTable(Model model){
        model.addAttribute("productSizeTableList",productSizeTableService.findAllProductSizeTable());
        return "/admin/product/lists/adminListProductSizeTable";
    }
    //Show all ProductType
    @RequestMapping(value = "/productTypeList", produces = "text/html; charset=UTF-8")
    public String showAllProductType(Model model){
        model.addAttribute("productTypeList",productTypeService.findAllProductType());
        return "/admin/product/lists/adminListProductType";
    }
    //Show all SiteData
    @RequestMapping(value = "/siteDataList", produces = "text/html; charset=UTF-8")
    public String showAllSiteData(Model model){
        model.addAttribute("siteDataList",siteDataService.findAllSiteData());
        return "/admin/siteData/adminListSiteData";
    }
    //Show all Users
    @RequestMapping(value = "/usersList", produces = "text/html; charset=UTF-8")
    public String showAllUsers(Model model){
        model.addAttribute("usersList",userService.findAllUser());
        return "/admin/user/adminListUsers";
    }

    /*ADMIN UPDATES CONTROLLERS !!!*/

    //Update Order By Id
    @GetMapping(value = "/order/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateOrderById(Model model, @PathVariable Long id){
        model.addAttribute("updateOrder",orderService.findOneOrderById(id));
        return "/admin/order/adminUpdateOrder";
    }
    @PostMapping(value = "/order/update", produces = "text/html; charset=UTF-8")
    public String updateOrder(@Valid Order order, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/order/adminUpdateOrder";
        }
        orderService.saveOrder(order);
        return "redirect:/admin/ordersList";
    }
    //Update ProductCategories By Id
    @GetMapping(value = "/productCategories/update/{id}", produces = "text/html; charset=UTF-8")
    public String updatProductCategoriesById(Model model, @PathVariable Long id){
        model.addAttribute("updateProductCategories",productCategoryService.findOneProductCategoryById(id));
        return "/admin/product/update/adminUpdateProductCategories";
    }
    @PostMapping(value = "/productCategories/update", produces = "text/html; charset=UTF-8")
    public String updateProductCategories(@Valid ProductCategory productCategory, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/productCategories/adminUpdateProductCategories";
        }
        productCategoryService.saveProductCategory(productCategory);
        return "redirect:/admin/productCategoriesList";
    }
    //Update ProductDetails By Id
    @GetMapping(value = "/productDetails/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateProductDetailsById(Model model, @PathVariable Long id){
        model.addAttribute("updateProductDetails",productDetailsService.findOneProductDetailsById(id));
        return "/admin/order/adminUpdateOrder";
    }
    @PostMapping(value = "/update", produces = "text/html; charset=UTF-8")
    public String updateProductDetails(@Valid ProductDetails productDetails, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/update/adminUpdateProductDetails";
        }
        productDetailsService.saveProductDetails(productDetails);
        return "redirect:/admin/ordersList";
    }
    //Update Product By Id
    @GetMapping(value = "/products/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateProductById(Model model, @PathVariable Long id){
        model.addAttribute("updateProduct",productService.findOneProductById(id));
        return "/admin/product/update/adminUpdateProduct";
    }
    @PostMapping(value = "/products/update", produces = "text/html; charset=UTF-8")
    public String updateProduct(@Valid Product product, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/update/adminUpdateProduct";
        }
        productService.saveProduct(product);
        return "redirect:/admin/productsList";
    }
    //Update ProductSizeTable By Id
    @GetMapping(value = "/productSizeTable/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateProductSizeTableById(Model model, @PathVariable Long id){
        model.addAttribute("updateProductSizeTable",productSizeTableService.findOneProductSizeTableById(id));
        return "/admin/product/update/adminUpdateProductSizeTable";
    }
    @PostMapping(value = "/productSizeTable/update", produces = "text/html; charset=UTF-8")
    public String updateProductSizeTable(@Valid ProductSizeTable productSizeTable, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/update/adminUpdateProductSizeTable";
        }
        productSizeTableService.saveProductSizeTable(productSizeTable);
        return "redirect:/admin/productSizeTableList";
    }
    //Update ProductType By Id
    @GetMapping(value = "/productType/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateProductTypeById(Model model, @PathVariable Long id){
        model.addAttribute("updateProductType",productTypeService.findOneProductTypeById(id));
        return "/admin/product/update/adminUpdateProductType";
    }
    @PostMapping(value = "/productType/update", produces = "text/html; charset=UTF-8")
    public String updateProductType(@Valid ProductType productType, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/update/adminUpdateProductType";
        }
        productTypeService.saveProductType(productType);
        return "redirect:/admin/productTypeList";
    }
    //Update SiteData By Id
    @GetMapping(value = "/siteData/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateSiteDataById(Model model, @PathVariable Long id){
        model.addAttribute("updateSiteData",siteDataService.findOneSiteDataById(id));
        return "/admin/siteData/adminUpdateSiteData";
    }
    @PostMapping(value = "/update", produces = "text/html; charset=UTF-8")
    public String updateSiteData(@Valid SiteData siteData, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/siteData/adminUpdateSiteData";
        }
        siteDataService.saveSiteData(siteData);
        return "redirect:/admin/siteDataList";
    }


        /*ADMIN ADD CONTROLLERS !!!*/


    /*ADMIN DELETE CONTROLLERS !!!*/
}
