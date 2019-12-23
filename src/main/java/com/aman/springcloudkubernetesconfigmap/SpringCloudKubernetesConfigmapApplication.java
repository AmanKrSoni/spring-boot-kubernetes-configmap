package com.aman.springcloudkubernetesconfigmap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringCloudKubernetesConfigmapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudKubernetesConfigmapApplication.class, args);
	}

}
