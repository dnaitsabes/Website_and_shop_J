package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.Order;
import pl.website.model.User;
import pl.website.service.OrderService;
import pl.website.service.UserService;

public class OrderConverter implements Converter<String, Order> {
    @Autowired
    private OrderService orderService;
    @Override
    public Order convert(String s) {
        return orderService.findOneOrderById(Long.parseLong(s));
    }
}
