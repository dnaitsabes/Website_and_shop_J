package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.User;
import pl.website.model.UserDetails;
import pl.website.service.UserDetailsService;
import pl.website.service.UserService;

public class UserDetailsConverter implements Converter<String, UserDetails> {
    @Autowired
    private UserDetailsService userDetailsService;
    @Override
    public UserDetails convert(String s) {
        return userDetailsService.findOneUserDetailsById(Long.parseLong(s));
    }
}
