package vn.hust.springbootcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("vn.hust")
public class SpringBootCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCoreApplication.class, args);
	}

}
