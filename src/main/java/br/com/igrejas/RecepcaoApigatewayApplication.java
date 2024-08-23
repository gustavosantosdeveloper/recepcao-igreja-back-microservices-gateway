package br.com.igrejas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RecepcaoApigatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecepcaoApigatewayApplication.class, args);
	}

}
