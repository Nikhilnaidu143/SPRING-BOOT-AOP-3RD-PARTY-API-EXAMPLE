package com.bridgelabz.thirdpartyapis.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping(value = "/example")
public class ExampleController {
	
	@GetMapping(value = "/hello")
	public String sayHello() {
		return "Hello Nikhil...!";
	}
	
	@GetMapping(value = "/search/{country}")
	public Object searchCountry(@PathVariable String country) {
		String externalUrl = "https://restcountries.com/v3.1/name/" + country;	
		RestTemplate restTemplate = new RestTemplate();
		Object countryData = restTemplate.getForObject(externalUrl, Object.class);
		return countryData;
	}
}
