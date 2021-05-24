package com.app1.restapp;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    public static void main(String[] args){
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
        String rawPassword="shree2021";
        String encodedPassword=encoder.encode(rawPassword);

        System.out.println(encodedPassword);
    }
}
