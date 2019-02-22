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
 /*       //Rejestracja konwertwrów Authora i Publishera i Categorii
    @Override
    public void addFormatters(FormatterRegistry registry) {
        registry.addConverter(getPublisherConverter());
        registry.addConverter(getAuthorConverter());
        registry.addConverter(getCategoryConverter());

    }
    //Rejestracja konwerterów Publisher
    @Bean
    public PublisherConverter getPublisherConverter() {
        return new PublisherConverter();
    }

    //Rejestracja konwerterów Author

    @Bean
    public CategoryConverter getCategoryConverter(){
        return new CategoryConverter();
    }
    //Rejestracja konwerterów Categorii
    @Bean
    public AuthorConverter getAuthorConverter() {
        return new AuthorConverter();
    }
*/
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

