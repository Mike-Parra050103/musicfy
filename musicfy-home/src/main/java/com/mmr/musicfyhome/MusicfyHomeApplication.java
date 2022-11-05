package com.mmr.musicfyhome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.mmr.musicfymodels.Model"})
public class MusicfyHomeApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MusicfyHomeApplication.class, args);
    }

}
