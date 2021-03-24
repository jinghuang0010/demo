package com.example.demo.web.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MyTest")
public class HelloWroldController {
	@Value("${xyx.name}")
	private String myname;
	@RequestMapping("/hello")
	public String hello() {
		return myname + "Hello Wrold! Wel come to spring boot!" ;
	}

}
