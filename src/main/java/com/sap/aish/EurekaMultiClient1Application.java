package com.sap.aish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaMultiClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMultiClient1Application.class, args);
	}
}
