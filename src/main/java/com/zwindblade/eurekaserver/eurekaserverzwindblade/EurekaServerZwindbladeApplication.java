package com.zwindblade.eurekaserver.eurekaserverzwindblade;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerZwindbladeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerZwindbladeApplication.class, args);
	}

}
