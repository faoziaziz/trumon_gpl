package tech.faozi.trumon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;


@Controller
public class PageController {
	
	@Value("${spring.application.name}")
	String appName;

	@GetMapping("/")
	public String homeAPI(Model model) {
		model.addAttribute("appName", appName);
		return "home";
	}
	
}
