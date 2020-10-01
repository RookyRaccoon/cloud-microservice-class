package com.example.cloudprojectregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class CloudProjectRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudProjectRegistryApplication.class, args);
	}

}
