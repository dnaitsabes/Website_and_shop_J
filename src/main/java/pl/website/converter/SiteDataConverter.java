package pl.website.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import pl.website.model.SiteData;
import pl.website.model.User;
import pl.website.service.SiteDataService;
import pl.website.service.UserService;

public class SiteDataConverter implements Converter<String, SiteData> {
    @Autowired
    private SiteDataService siteDataService;
    @Override
    public SiteData convert(String s) {
        return siteDataService.findOneSiteDataById(Long.parseLong(s));
    }
}
