package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.ProductDetails;
import pl.website.model.User;
import pl.website.service.ProductDetailsService;
import pl.website.service.UserService;

public class ProductDetailsConverter  implements Converter<String, ProductDetails> {
    @Autowired
    private ProductDetailsService productDetailsService;
    @Override
    public ProductDetails convert(String s) {
        return productDetailsService.findOneProductDetailsById(Long.parseLong(s));
    }
}
