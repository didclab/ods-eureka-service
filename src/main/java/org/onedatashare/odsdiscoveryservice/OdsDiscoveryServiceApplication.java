package org.onedatashare.odsdiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OdsDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OdsDiscoveryServiceApplication.class, args);
	}

}
