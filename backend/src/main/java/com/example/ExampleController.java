package com.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@RequestMapping(value = "/health", method = RequestMethod.GET)
	public ResponseEntity<String> health() {
		return new ResponseEntity<String>(HttpStatus.OK);
	}
}
