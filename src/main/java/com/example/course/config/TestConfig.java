package com.example.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.User;
import com.example.course.repositories.UserRepository;

/* essa classe de configuracao eh para popular o banco de dado */
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	/* esse autowired eh para o spring resolver essa dependencia */
	@Autowired
	private UserRepository userRepository;

	/* o comando a seguir eh executado sempre que o programa for iniciado */
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
	
}
