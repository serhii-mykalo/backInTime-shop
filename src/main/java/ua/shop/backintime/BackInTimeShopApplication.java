package ua.shop.backintime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "/user")
public class BackInTimeShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackInTimeShopApplication.class, args);
	}

}
