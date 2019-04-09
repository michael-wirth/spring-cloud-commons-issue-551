package com.example.demo;

import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class IndexController {

	@GetMapping("/")
	public RepresentationModel index() {
		RepresentationModel model = new RepresentationModel();
		model.add(linkTo(methodOn(HelloWorldController.class).hello(null)).withRel("hello"));

		return model;

	}
}
