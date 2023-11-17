package com.nt.niranjana.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
//@EnableHystrix
public class Spboot2xCloudGatewayServiceConsumerByjtApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spboot2xCloudGatewayServiceConsumerByjtApplication.class, args);
	}

}
