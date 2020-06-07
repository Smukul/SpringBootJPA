package com.jpa.examples;

import com.jpa.examples.entities.User;
import com.jpa.examples.service.UserDaoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDaoServiceCommandLineRunner implements CommandLineRunner {
    @Autowired
    private UserDaoService userDaoService;

    private static final Logger logger = LoggerFactory.getLogger(UserDaoServiceCommandLineRunner.class);

    @Override
    public void run(String... args) throws Exception {
        //Users
        User ram = new User("Ram","Admin");
        //User ramesh = new User("Ramesh","Developer");
        long id = userDaoService.insert(ram);
        logger.info("Added userID>> "+id);
    }
}
