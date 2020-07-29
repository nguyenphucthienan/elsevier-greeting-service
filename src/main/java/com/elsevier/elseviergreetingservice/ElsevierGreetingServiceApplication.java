package com.elsevier.elseviergreetingservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class ElsevierGreetingServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(ElsevierGreetingServiceApplication.class, args);
  }
}
