package com.example.demo;

import java.util.Collection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/foo")
public class Swagger3Controller {

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	FooDto createFoo(@RequestBody CreateFooDto createFooDto) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
	}

	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	void deleteFooById(@PathVariable long id) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
	}

	@GetMapping
	Collection<FooDto> findByCriteria(@RequestParam(required = false) String someOptionalParam,
			@RequestParam(required = true) Integer someRequiredParam) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
	}

	@GetMapping("/{id}")
	FooDto findFooById(@PathVariable long id) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
	}

	@PutMapping
	FooDto updateFoo(@RequestBody FooDto foo) {
		throw new ResponseStatusException(HttpStatus.NOT_IMPLEMENTED);
	}

}
