package com.example.springapp.Controllers.ApiController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/welcome")
 public String Welcome()
 {
	 return "welcome String Boot!";
 }
}
