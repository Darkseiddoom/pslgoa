package com.springmvcone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class LoginDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public boolean check(String login, String password) {
		String query = "select * from logindb";

		List<User> products = jdbcTemplate.query(query, new BeanPropertyRowMapper<User>(User.class));
		for (User u : products) {
			if (login.equals(u.getName()) && password.equals(u.getPassword()))
				return true;

		}
		return false;

	}
}
