package tech.faozi.trumon.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PageController {

	@GetMapping("/")
	public String homeAPI() {
		return "Check port";
	}
	
}
