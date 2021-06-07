package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Test {

    @GetMapping("/greeting")
	public String greeting() {
        log.info("Hello!!!");
		return "Hello!!!!";
	}
    
}
