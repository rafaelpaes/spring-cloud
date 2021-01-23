package com.paes.delivery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DeliveryEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryEurekaServerApplication.class, args);
	}
}