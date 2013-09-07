package com.includio.ecom;

import javax.inject.Inject;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.util.Assert;

public class DefaultAppConfigTest extends SpringTest{

	@Inject
	private JdbcTemplate jdbcTemplate; 
	
	@Test
	public void test() {
		Assert.notNull(jdbcTemplate,"jdbcTemplate init failed!");
	}

}
