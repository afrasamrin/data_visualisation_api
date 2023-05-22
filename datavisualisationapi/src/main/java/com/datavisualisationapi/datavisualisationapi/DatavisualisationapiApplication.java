package com.datavisualisationapi.datavisualisationapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableAutoConfiguration(exclude = {org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
public class DatavisualisationapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatavisualisationapiApplication.class, args);
	}

}
