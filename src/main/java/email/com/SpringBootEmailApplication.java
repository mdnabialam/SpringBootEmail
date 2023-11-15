package email.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEmailApplication.class, args);
		System.out.println("PORT No 8888");
	}

}
