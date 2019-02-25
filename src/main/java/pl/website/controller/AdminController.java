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

    /*ADMIN SHOW ALL  !!!*/
    //Show all newslletter
    @RequestMapping(value = "/newslettersList", produces = "text/html; charset=UTF-8")
    public String showAllNewsletters(Model model){
        model.addAttribute("newsletter",newsletterService.findAllNewsletter());
        return "/admin/newsletter/adminListNewsletter";
    }

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

    /*ADMIN UPDATES  !!!*/

    //Update Order By Id
    @GetMapping(value = "/order/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateOrderById(Model model, @PathVariable Long id){
        model.addAttribute("updateOrder",orderService.findOneOrderById(id));
        return "/admin/order/adminUpdateOrder";
    }
    @PostMapping(value = "/order/update", produces = "text/html; charset=UTF-8")
    public String updateOrder(@ModelAttribute Order order) {
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
    public String updateProductCategories(@ModelAttribute ProductCategory productCategory) {
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
    public String updateProductDetails(@ModelAttribute ProductDetails productDetails) {
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
    public String updateProduct(@ModelAttribute Product product) {
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
    public String updateProductSizeTable(@ModelAttribute ProductSizeTable productSizeTable) {
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
    public String updateProductType(@ModelAttribute ProductType productType) {
        productTypeService.saveProductType(productType);
        return "redirect:/admin/productTypeList";
    }
    //Update SiteData By Id
    @GetMapping(value = "/siteData/update/{id}", produces = "text/html; charset=UTF-8")
    public String updateSiteDataById(Model model, @PathVariable Long id){
        model.addAttribute("updateSiteData",siteDataService.findOneSiteDataById(id));
        return "/admin/siteData/adminUpdateSiteData";
    }
    @PostMapping(value = "/siteData/update", produces = "text/html; charset=UTF-8")
    public String updateSiteData(@ModelAttribute SiteData siteData) {
        siteDataService.saveSiteData(siteData);
        return "redirect:/admin/siteDataList";
    }


        /*ADMIN ADD  !!!*/

    //Add new date for ProductCategories
    @GetMapping(value = "/productCategory/add", produces = "text/html; charset=UTF-8")
    public String addProductCategory(Model model) {
        model.addAttribute("productCategory", new ProductCategory());
        return "/admin/product/add/adminAddProductCategories";
    }

    @PostMapping(value = "/productCategory/add", produces = "text/html; charset=UTF-8")
    public String addProductCategory(@Valid ProductCategory productCategory, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/add/adminAddProductCategories";
        }
        productCategoryService.saveProductCategory(productCategory);
        return "redirect:/admin/productCategoriesList";
    }
    //Add new date for ProductDetail
    @GetMapping(value = "/productDetail/add", produces = "text/html; charset=UTF-8")
    public String addProductDetail(Model model) {
        model.addAttribute("productDetail", new ProductDetails());
        return "/admin/product/add/adminAddProductDetails";
    }

    @PostMapping(value = "/productDetail/add", produces = "text/html; charset=UTF-8")
    public String addProductDetails(@Valid ProductDetails productDetails, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/add/adminAddProductDetails";
        }
        productDetailsService.saveProductDetails(productDetails);
        return "redirect:/admin/productsDetailsList";
    }
    //Add new date for Product
    @GetMapping(value = "/product/add", produces = "text/html; charset=UTF-8")
    public String addProduct(Model model) {
        model.addAttribute("product", new Product());
        return "/admin/product/add/adminAddProducts";
    }

    @PostMapping(value = "/product/add", produces = "text/html; charset=UTF-8")
    public String addProduct(@Valid Product product, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/add/adminAddProducts";
        }
        productService.saveProduct(product);
        return "redirect:/admin/productsList";
    }
    //Add new date for ProductSizeTable
    @GetMapping(value = "/productSizeTable/add", produces = "text/html; charset=UTF-8")
    public String addProductSizeTable(Model model) {
        model.addAttribute("productSizeTable", new ProductSizeTable());
        return "/admin/product/add/adminAddProductSizeTable";
    }

    @PostMapping(value = "/productSizeTable/add", produces = "text/html; charset=UTF-8")
    public String addProductSizeTable(@Valid ProductSizeTable productSizeTable, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/add/adminAddProductSizeTable";
        }
        productSizeTableService.saveProductSizeTable(productSizeTable);
        return "redirect:/admin/productSizeTableList";
    }
    //Add new date for ProductType
    @GetMapping(value = "/productType/add", produces = "text/html; charset=UTF-8")
    public String addProductType(Model model) {
        model.addAttribute("productType", new ProductType());
        return "/admin/product/add/adminAddProductType";
    }

    @PostMapping(value = "/productType/add", produces = "text/html; charset=UTF-8")
    public String addProductType(@Valid ProductType productType, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/add/adminAddProductType";
        }
        productTypeService.saveProductType(productType);
        return "redirect:/admin/productTypeList";
    }
    //Add new date for SiteData
    @GetMapping(value = "/siteData/add", produces = "text/html; charset=UTF-8")
    public String addSiteData(Model model) {
        model.addAttribute("siteData", new SiteData());
        return "/admin/product/add/adminAddSiteData";
    }

    @PostMapping(value = "/siteData/add", produces = "text/html; charset=UTF-8")
    public String addSiteData(@Valid SiteData siteData, BindingResult result) {
        if (result.hasErrors()){
            return "/admin/product/add/adminAddSiteData";
        }
        siteDataService.saveSiteData(siteData);
        return "redirect:/admin/siteDataList";
    }

    /*ADMIN DELETE  !!!*/

    //Delete Order
    @GetMapping(value = "/order/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteOrder(@PathVariable Long id){
        orderService.deleteOneOrderrById(id);
        return "redirect:/admin/ordersList";
    }
    //Delete ProductCategory
    @GetMapping(value = "/productCategory/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteProductCategory(@PathVariable Long id){
        productCategoryService.deleteOneProductCategoryById(id);
        return "redirect:/admin/productCategoriesList";
    }
    //Delete ProductDetails
    @GetMapping(value = "/productDetails/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteProductDetails(@PathVariable Long id){
        productDetailsService.deleteOneProductDetailsById(id);
        return "redirect:/admin/productsDetailsList";
    }
    //Delete Product
    @GetMapping(value = "/product/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteProduct(@PathVariable Long id){
        productService.deleteOneProductById(id);
        return "redirect:/admin/productsList";
    }
    //Delete ProductSizeTable
    @GetMapping(value = "/productSizeTable/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteProductSizeTable(@PathVariable Long id){
        productSizeTableService.deleteOneProductSizeTableById(id);
        return "redirect:/admin/productSizeTableList";
    }
    //Delete ProductType
    @GetMapping(value = "/productType/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteProductType(@PathVariable Long id){
        productTypeService.deleteOneProductTypeById(id);
        return "redirect:/admin/productTypeList";
    }
    //Delete SiteData
    @GetMapping(value = "/siteData/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteSiteData(@PathVariable Long id){
        siteDataService.deleteOneSiteDataById(id);
        return "redirect:/admin/siteDataList";
    }
    //Delete User
    @GetMapping(value = "/user/delete/{id}", produces = "text/html; charset=UTF-8")
    public String deleteUser(@PathVariable Long id){
        userService.deleteOneUserById(id);
        return "/admin/user/adminListUsers";
    }
}
