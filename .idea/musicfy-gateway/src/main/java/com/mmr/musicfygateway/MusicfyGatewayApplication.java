package com.mmr.musicfygateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MusicfyGatewayApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MusicfyGatewayApplication.class, args);
    }

}
