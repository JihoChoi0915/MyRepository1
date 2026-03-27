package pack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients

public class Feign02Application {

	public static void main(String[] args) {
		SpringApplication.run(Feign02Application.class, args);
		System.out.println("공부싫다");
		
	}

}
