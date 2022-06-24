package com.micro.security;

import com.micro.security.entities.Role;
import com.micro.security.entities.User;
import com.micro.security.service.UserService;
import com.micro.security.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }


    @Bean
    BCryptPasswordEncoder getBCE() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    CommandLineRunner commandLineRunner(UserService userService) {
        return args -> {
            userService.addRole(new Role(null, "ADMIN"));
            userService.addRole(new Role(null, "USER"));

            //ajouter les users
            userService.saveUser(new User(null, "admin", "123", true, null));
            userService.saveUser(new User(null, "amine", "123", true, null));

            //ajouter les rôles aux users
            userService.addRoleToUser("admin", "ADMIN");
            userService.addRoleToUser("admin", "USER");
            userService.addRoleToUser("amine", "USER");


        };
    }
}
