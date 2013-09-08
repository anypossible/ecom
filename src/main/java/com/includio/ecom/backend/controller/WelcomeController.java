package com.includio.ecom.backend.controller;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.includio.ecom.backend.service.UserService;

/**
 * just a example of using controller
 * @author Shihai.Fu
 *
 */
@Controller
public class WelcomeController {
	
	@Inject
	private UserService userService;

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public String welcome(@PathVariable("userId") int userId, Map<String,Object> map) {
		map.put("user", userService.getUser(userId));
		return "welcome";
	}
	
	@RequestMapping(value = "/404", method = RequestMethod.GET)
	public String pageNotFound() {
		return "default-404";
	}
	
	@RequestMapping(value = "/500", method = RequestMethod.GET)
	public String internalError() {
		return "default-error";
	}
}
