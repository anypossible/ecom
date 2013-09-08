package com.includio.ecom;

import javax.inject.Inject;

import org.hibernate.SessionFactory;
import org.hibernate.dialect.MySQL5Dialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

/**
 * DB related configurations
 * 
 * @author Shihai.Fu
 * 
 */
@PropertySource("classpath:jdbc.properties")
public class DBConfig extends DefaultAppConfig {

	@Inject
	Environment env;

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
		dataSource.setUsername(env.getRequiredProperty("jdbc.username"));
		dataSource.setPassword(env.getRequiredProperty("jdbc.password"));
		dataSource.setUrl(env.getRequiredProperty("jdbc.url"));
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate() {
		DriverManagerDataSource dataSource = dataSource();
		JdbcTemplate template = new JdbcTemplate(dataSource);
		return template;
	}

	/**
	 * enable hibernate only to create table
	 * @return
	 */
	@Bean
	SessionFactory sessionFactory() {
		LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(dataSource()).scanPackages(AppConfig.class.getPackage().getName());
		builder.setProperty(org.hibernate.cfg.Environment.DIALECT, 	MySQL5Dialect.class.getName());
//		builder.setProperty(org.hibernate.cfg.Environment.HBM2DDL_AUTO, "update");
		builder.setProperty(org.hibernate.cfg.Environment.HBM2DDL_AUTO, "create");
		return builder.buildSessionFactory();
	}

}
