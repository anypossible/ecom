package com.includio.ecom;

import javax.inject.Inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * config data source and jdbc template
 * 
 * @author Shihai.Fu
 * 
 */
@PropertySource("classpath:jdbc.properties")
public class DBConfig extends DefaultAppConfig {

	@Inject
	Environment env;

	@Bean
	public JdbcTemplate jdbcTemplate() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
		dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template;
	}

}
