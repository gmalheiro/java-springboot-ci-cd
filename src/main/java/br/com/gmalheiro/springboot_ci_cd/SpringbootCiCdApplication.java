package br.com.gmalheiro.springboot_ci_cd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootCiCdApplication {

	@GetMapping("/welcome")
	public String welcome () {
		return  "Welcome";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootCiCdApplication.class, args);
	}

}
