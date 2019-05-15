package com.petcare.delete.Deletepuppies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DeletePuppiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeletePuppiesApplication.class, args);
	}

}
