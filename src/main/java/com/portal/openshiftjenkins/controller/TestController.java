package com.portal.openshiftjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/hello")
	public String ping() {
		return "Welcome to Openshift Jenkins Pipeline Integration.!!";
	}

	@GetMapping("/openshift")
	public String pong() {
		return "Hello From Openshift 4.14.!";
	}

}
