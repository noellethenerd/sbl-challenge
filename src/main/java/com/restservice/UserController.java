package com.restservice;


import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();
	private static final String sequence = "ACGCTAGC";
	private List<String> dnaseqs =  Arrays.asList("ACTGCTAGCTAGCT", "ACTGCTAGCTAGCT",
	"ACTGCTAGCTAGCT", 
	"ACTGCTAGCTAGCA",
	"TCTGCTAGCTAGCA");

	@GetMapping("/greeting")
	public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(), String.format(template, name));
	}

	@GetMapping("/test")
	public String test() {
		return sequence;           
	}

	@GetMapping("/sequences") 
	public List<String> getSeq() {
		return dnaseqs;
	}

}
