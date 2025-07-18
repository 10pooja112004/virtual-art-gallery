package com.virtualartgallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.virtualartgallery")
@EnableJpaRepositories("com.virtualartgallery.repository")
public class VirtualArtGalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(VirtualArtGalleryApplication.class, args);
	}

}
