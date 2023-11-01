package com.example.jdbc.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCommandRun implements CommandLineRunner {

    @Autowired
    private UserJdbcRepository user;

    @Override
    public void run(String... args) throws Exception {
        user.insert(new Users(1, "martin", "seoul mapo"));
        user.insert(new Users(2, "홍길동", "서울 용산"));
        user.insert(new Users(3, "이몽룡", "서울 서대문"));

        user.deleteId(1);
    }
}