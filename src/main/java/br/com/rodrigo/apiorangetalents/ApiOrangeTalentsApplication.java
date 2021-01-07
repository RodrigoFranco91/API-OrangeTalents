package br.com.rodrigo.apiorangetalents;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = HibernateJpaAutoConfiguration.class)
public class ApiOrangeTalentsApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ApiOrangeTalentsApplication.class, args);
	}

}
