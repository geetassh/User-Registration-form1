package com.app1.restapp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import javax.swing.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTests {
    @Autowired
    private UserRepository repo;
    @Autowired
    private TestEntityManager entityManager;

    @Test
    public void testCreateUser(){
        User user=new User();
        user.setEmail("ganesh8888@gmail.com");
        user.setPassword("ganesh2021");
        user.setFirstname("Ganesh");
        user.setLastname("Howal");

        User savedUser=repo.save(user);
        entityManager.find(User.class,savedUser.getId());



    }
  /*  @Test
    public void testFindUserByEmail(){
        String email="shree8888@gmail.com";
        User user= repo.findByEmail(email);

    }*/
}
