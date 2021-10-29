package com.sujata.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sujata.service.DemoService;

@RestController
public class DemoResource {

	@Autowired
	private DemoService demoService;
	
	@RequestMapping(path = "/first",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String firstResource() {
		return demoService.getMessage();
	}
	
	@RequestMapping(path = "/second",method = RequestMethod.GET,produces = MediaType.TEXT_HTML_VALUE)
	public String secondResource() {
		return demoService.getMessage();
	}
	
	@RequestMapping(path = "/greet/{na}",method = RequestMethod.GET,produces = MediaType.TEXT_PLAIN_VALUE)
	public String exposeGreet(@PathVariable("na") String name) {
		return demoService.greet(name);
	}
}
