package com.mmr.musicfyserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MusicfyServerApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MusicfyServerApplication.class, args);
    }

}
