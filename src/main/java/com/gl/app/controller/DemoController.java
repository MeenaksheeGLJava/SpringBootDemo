package com.gl.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping("/demo")
	public String getDemo() {
		System.out.println("Inside getDemo() method");
		return "Hello World!";
	}

}
