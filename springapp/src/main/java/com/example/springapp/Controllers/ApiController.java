package com.example.ApiController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("/welcome")
 public String Welcome()
 {
	 return "welcome String Boot!";
 }
}
