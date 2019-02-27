package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.ProductType;
import pl.website.model.User;
import pl.website.service.ProductTypeService;
import pl.website.service.UserService;

public class ProductTypeConverter implements Converter<String, ProductType> {
    @Autowired
    private ProductTypeService productTypeService;
    @Override
    public ProductType convert(String s) {
        return productTypeService.findOneProductTypeById(Long.parseLong(s));
    }
}