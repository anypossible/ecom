package com.includio.ecom.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.includio.ecom.DBConfig;

/**
 * test configuration
 * @author Shihai.Fu
 *
 */
@Configuration
@ComponentScan(basePackageClasses = AppConfigTest.class)
@EnableTransactionManagement
public class AppConfigTest extends DBConfig{
	
}
