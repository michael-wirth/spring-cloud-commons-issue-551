package com.example.demo;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.hypermedia.DiscoveredResource;
import org.springframework.cloud.client.hypermedia.ServiceInstanceProvider;
import org.springframework.cloud.client.hypermedia.StaticServiceInstanceProvider;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DiscoveredResourceConfiguration {

	@Bean
	DiscoveredResource discoveredResource(ServiceInstanceProvider provider) {
		return new DiscoveredResource(provider, traverson -> traverson.follow("hello"));
	}

	@Bean
	StaticServiceInstanceProvider staticServiceInstanceProvider() {
		return new StaticServiceInstanceProvider(new DefaultServiceInstance(null, null, "localhost", 8080, false));
	}
}
