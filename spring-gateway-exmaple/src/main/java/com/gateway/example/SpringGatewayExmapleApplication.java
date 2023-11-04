package com.gateway.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringGatewayExmapleApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringGatewayExmapleApplication.class, args);
	}
}
