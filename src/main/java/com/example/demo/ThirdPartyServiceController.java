package com.example.demo;

import org.springframework.cloud.client.hypermedia.DiscoveredResource;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThirdPartyServiceController {

	private final DiscoveredResource discoveredResource;

	public ThirdPartyServiceController(DiscoveredResource discoveredResource) {
		this.discoveredResource = discoveredResource;
	}

	@GetMapping("/test")
	public RepresentationModel test() {
		RepresentationModel model = new RepresentationModel();

		model.add(discoveredResource.getLink().expand("name", "Michael"));

		return model;
	}
}
