package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.Newsletter;
import pl.website.model.User;
import pl.website.service.NewsletterService;

public class NewsletterConverter implements Converter<String, Newsletter> {
   @Autowired
   private NewsletterService newsletterService;

    @Override
    public Newsletter convert(String s) {
        return newsletterService.findOneNewsletterById(Long.parseLong(s));
    }
    }

