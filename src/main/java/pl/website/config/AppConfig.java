package pl.website.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.format.FormatterRegistry;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.LocaleContextResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import pl.website.converter.*;


import javax.persistence.EntityManagerFactory;
import javax.validation.Validator;
import java.util.Locale;

@Configuration
@EnableWebMvc
@ComponentScan("pl.website")
@EnableTransactionManagement
//do dataSpring
@EnableJpaRepositories("pl.website.repository")
public class AppConfig extends WebMvcConfigurerAdapter{

    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver =
                new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver; }
    @Bean
    public LocalEntityManagerFactoryBean entityManagerFactory() {
        LocalEntityManagerFactoryBean emfb = new LocalEntityManagerFactoryBean();
        emfb.setPersistenceUnitName("bookstorePersistenceUnit");
        return emfb; }
    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
        JpaTransactionManager tm = new JpaTransactionManager(emf);
        return tm; }
        //Rejestracja konwertwrów
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(getNewsletterConverter());
        registry.addConverter(getOrderConverter());
        registry.addConverter(getProductCategoryConverter());
        registry.addConverter(getProductConverter());
        registry.addConverter(getProductDetailsConverter());
        registry.addConverter(getProductSizeTableConverter());
        registry.addConverter(getProductTypeConverter());
        registry.addConverter(getSiteDataConverter());
        registry.addConverter(getUserConverter());
        registry.addConverter(getUserDetailsConverter());

    }
    //Rejestracja konwerterów stwozrenie ziaren
    @Bean
    public NewsletterConverter getNewsletterConverter() {
        return new NewsletterConverter();
    }
    @Bean
    public OrderConverter getOrderConverter(){
        return new OrderConverter();
    }
    @Bean
    public ProductCategoryConverter getProductCategoryConverter() {
        return new ProductCategoryConverter();
    }
    @Bean
    public ProductConverter getProductConverter() {
        return new ProductConverter();
    }
    @Bean
    public ProductDetailsConverter getProductDetailsConverter() {
        return new ProductDetailsConverter();
    }
    @Bean
    public ProductSizeTableConverter getProductSizeTableConverter() {
        return new ProductSizeTableConverter();
    }
    @Bean
    public ProductTypeConverter getProductTypeConverter() {
        return new ProductTypeConverter();
    }
    @Bean
    public SiteDataConverter getSiteDataConverter() {
        return new SiteDataConverter();
    }
    @Bean
    public UserConverter getUserConverter() {
        return new UserConverter();
    }
    @Bean
    public UserDetailsConverter getUserDetailsConverter() {
        return new UserDetailsConverter();
    }
    //Ziarno do konfiguracji walidacji
    @Bean(name="localeResolver")
    public LocaleContextResolver getLocaleContextResolver() {
        SessionLocaleResolver localeResolver = new SessionLocaleResolver();
        localeResolver.setDefaultLocale(new Locale("pl","PL"));
        return localeResolver; }

        //beamn z walidatorem
        @Bean
        public Validator validator() {
            return new LocalValidatorFactoryBean();
        }
}

