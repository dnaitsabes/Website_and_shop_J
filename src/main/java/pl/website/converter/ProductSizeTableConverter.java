package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.ProductSizeTable;
import pl.website.model.User;
import pl.website.service.ProductSizeTableService;
import pl.website.service.UserService;

public class ProductSizeTableConverter  implements Converter<String, ProductSizeTable> {
    @Autowired
    private ProductSizeTableService productSizeTableService;
    @Override
    public ProductSizeTable convert(String s) {
        return productSizeTableService.findOneProductSizeTableById(Long.parseLong(s));
    }
}
