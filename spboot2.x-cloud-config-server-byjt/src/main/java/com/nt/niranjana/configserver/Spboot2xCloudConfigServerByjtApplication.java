package com.nt.niranjana.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class Spboot2xCloudConfigServerByjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spboot2xCloudConfigServerByjtApplication.class, args);
		System.out.println("Config Server Started...");
	}

}
