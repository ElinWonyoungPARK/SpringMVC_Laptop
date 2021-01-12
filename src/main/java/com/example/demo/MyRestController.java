package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("/hello")
	public Map<?,?> hellp(){
		var map = new HashMap<>();
		System.out.println("----------REST REST-----------");
		map.put("message", "SUCCESS");
		return map;
	}
}