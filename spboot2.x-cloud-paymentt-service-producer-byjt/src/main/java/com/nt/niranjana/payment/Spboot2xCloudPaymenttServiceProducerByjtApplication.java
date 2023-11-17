package com.nt.niranjana.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Spboot2xCloudPaymenttServiceProducerByjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spboot2xCloudPaymenttServiceProducerByjtApplication.class, args);
	}

}
