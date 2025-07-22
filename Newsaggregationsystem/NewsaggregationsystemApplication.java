package com.example.Newsaggregationsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication(scanBasePackages = "com.example.Newsaggregationsystem")
@EntityScan("com.example.Newsaggregationsystem.Entities")
@EnableJpaRepositories("com.example.Newsaggregationsystem.Repository")
public class NewsaggregationsystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(NewsaggregationsystemApplication.class, args);
    }

}
