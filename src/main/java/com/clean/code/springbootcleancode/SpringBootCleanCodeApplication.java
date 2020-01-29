package com.clean.code.springbootcleancode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class SpringBootCleanCodeApplication {



	public static void main(String[] args) {
		SpringApplication.run(SpringBootCleanCodeApplication.class, args);
	}

//	@Scheduled(fixedRate = 1000L)
//	public void startRate(){
//		System.out.println("New rate " + new Date());
//	}
//

	@Scheduled(cron = "0 40 23 * * *")
	public void startCron(){
		System.out.println("New startCron  " + new Date());
	}



}
