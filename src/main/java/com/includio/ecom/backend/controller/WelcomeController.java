package com.includio.ecom.backend.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * just a example of using controller
 * @author Shihai.Fu
 *
 */
@Controller
public class WelcomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String welcome(Map<String,Object> map) {
		map.put("message", "this is just a test");
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
