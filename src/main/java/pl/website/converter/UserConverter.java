package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.User;
import pl.website.service.UserService;

public class UserConverter implements Converter<String, User> {
    @Autowired
    private UserService userService;
    @Override
    public User convert(String s) {
        return userService.findOneUserById(Long.parseLong(s));
    }
}
