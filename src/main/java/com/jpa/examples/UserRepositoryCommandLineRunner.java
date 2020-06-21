package com.jpa.examples;

import com.jpa.examples.entities.User;
import com.jpa.examples.service.UserDaoService;
import com.jpa.examples.service.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    private static final Logger logger = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        //Users
        User mahesh = new User("Mahesh","Developer");
        //User ramesh = new User("Ramesh","Developer");
        userRepository.save(mahesh);
        logger.info("Added user>> "+mahesh);

        Optional<User> userById = userRepository.findById(1L);
        logger.info("FindUserById user>> "+userById);

        List<User> all = userRepository.findAll();
        logger.info("Find All users>> "+all);
    }
}
