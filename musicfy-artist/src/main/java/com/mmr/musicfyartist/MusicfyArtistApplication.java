package com.mmr.musicfyartist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
@EntityScan({"com.mmr.musicfymodels.Model"})
public class MusicfyArtistApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(MusicfyArtistApplication.class, args);
    }

}
