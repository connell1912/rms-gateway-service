package com.rms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
*@author 1912dec16 Fullstack Java
*<br>
*<br>
*The Zuul gateway gives us a location to access all of the services within the app by creating routes to each
*service. It works in conjunction with the Eureka Server which gives Zuul the locations of all the other microservices.
*/
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class GatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
	}

}

