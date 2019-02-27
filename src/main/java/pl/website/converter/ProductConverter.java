package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.Product;
import pl.website.model.User;
import pl.website.service.ProductService;
import pl.website.service.UserService;

public class ProductConverter implements Converter<String, Product> {
    @Autowired
    private ProductService productService;
    @Override
    public Product convert(String s) {
        return productService.findOneProductById(Long.parseLong(s));
    }
}
