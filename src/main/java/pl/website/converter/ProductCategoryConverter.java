package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.ProductCategory;
import pl.website.model.User;
import pl.website.service.ProductCategoryService;
import pl.website.service.UserService;

public class ProductCategoryConverter implements Converter<String, ProductCategory> {
    @Autowired
    private ProductCategoryService productCategoryService;
    @Override
    public ProductCategory convert(String s) {
        return productCategoryService.findOneProductCategoryById(Long.parseLong(s));
    }
}
