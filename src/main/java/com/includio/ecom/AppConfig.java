package com.includio.ecom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;
import org.springframework.web.servlet.view.tiles2.TilesConfigurer;
import org.springframework.web.servlet.view.tiles2.TilesViewResolver;

/**
 * ApplicationContext configuration
 * @author Shihai.Fu
 *
 */
@Configuration
@ComponentScan(basePackageClasses = AppConfig.class)
@EnableTransactionManagement
public class AppConfig extends DBConfig{

	@Bean
    public SessionLocaleResolver localeResolver() {
        return new SessionLocaleResolver();
    }
	
	@Bean
    public TilesViewResolver viewResolver() {
        return new TilesViewResolver();
    }

    @Bean
    public TilesConfigurer tilesConfigurer() {
        TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[] { "classpath:config/tiles/backend-tiles.xml", "classpath:config/tiles/common-tiles.xml" });
        return tilesConfigurer;
    }

    @Bean
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        return multipartResolver;
    }
}
