package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
	@GetMapping("disp")
 public String Welcome()
 {
	 return "welcome String Boot!";
 }
}
