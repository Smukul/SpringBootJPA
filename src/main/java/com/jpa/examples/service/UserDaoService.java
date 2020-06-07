package com.jpa.examples.service;

import com.jpa.examples.entities.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserDaoService {
    @PersistenceContext
    private EntityManager entityManager;
    //Users
    User ram = new User("Ram","Admin");
    User ramesh = new User("Ramesh","Developer");

    //Persistence context


    public long insert(User user){
        entityManager.persist(user);
        return user.getId();
    }
}
