package com.nt.niranjana;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Spboot2xCloudEurekaServerByjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spboot2xCloudEurekaServerByjtApplication.class, args);
	}

}
