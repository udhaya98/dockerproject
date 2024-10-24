package com.automation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/auto")
public class Automation {
	@GetMapping("/automate")
	public String getMethodName() {
		return "Hello World";
	}
	

}
