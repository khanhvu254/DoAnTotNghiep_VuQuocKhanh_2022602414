package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class DoAnTotNghiepLeMinhQuangApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoAnTotNghiepLeMinhQuangApplication.class, args);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        System.out.println(encoder.encode("password123"));
        System.out.println(encoder.encode("Quang2004@"));
	}

}
