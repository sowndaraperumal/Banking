package com.banking.notificationService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class BankingNotificationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingNotificationServiceApplication.class, args);
	}

}
