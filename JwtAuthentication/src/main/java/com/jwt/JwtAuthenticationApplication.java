package com.jwt;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jwt.entity.User;
import com.jwt.repository.UserRepository;

@SpringBootApplication
public class JwtAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(JwtAuthenticationApplication.class, args);
		System.out.println("Executing");
	}

	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void initUsers() {
		List<User> userList = Stream.of(new User(101, "prince", "prince", "prince@gmail.com"),
				new User(102, "pritam", "pritam", "pritam@gmail.com"),
				new User(103, "shubham", "shubham", "shubham@gmail.com"),
				new User(104, "manish", "manish", "manish@gmail.com")).collect(Collectors.toList());

//		userRepository.saveAll(userList);

	}

}
