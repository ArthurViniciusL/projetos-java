package com.crudjava.crudjava;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexCrontoller {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
