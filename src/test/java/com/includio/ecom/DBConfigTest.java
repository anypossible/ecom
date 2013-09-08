package com.includio.ecom;

import javax.inject.Inject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;

import com.includio.ecom.infrastructure.domain.User;

/**
 * test db configurations
 * @author Shihai.Fu
 *
 */
public class DBConfigTest extends SpringTest{

	@Inject
	private JdbcTemplate jdbcTemplate; 
	
	@Inject
	SessionFactory sessionFactory;
	
	@Test
	public void testJdbcTemplate() {
		Assert.assertNotNull("jdbcTemplate init failed!", jdbcTemplate);
	}
	
	@Test
	public void test() {
		Assert.assertNotNull("sessoinFactory init failed!" ,sessionFactory);
		User user = new User();
		user.setShowName("Shihai Fu");
		user.setStatus("Y");
		user.setUsername("shihai_fu");
		Session currentSession = sessionFactory.openSession();
		currentSession.save(user);
		Assert.assertNotNull("User not persist!", currentSession.get(User.class, user.getId()));
	}

}
