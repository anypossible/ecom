package com.includio.ecom.infrastructure.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.inject.Inject;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.includio.ecom.infrastructure.domain.User;

/**
 * example repository
 * 
 * @author Shihai.Fu
 * 
 */
@Repository
public class UserRepository {

	@Inject
	private JdbcTemplate jdbcTemplate;

	public User get(int id) {
		return jdbcTemplate.queryForObject("select * from ecom.user where id = ?", new RowMapper<User>(){

			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setShowName(rs.getString("show_name"));
				user.setStatus(rs.getString("status"));
				user.setUsername(rs.getString("username"));
				return user;
			}}, id);
	}
}
