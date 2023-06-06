package com.ironhack;

import com.google.gson.Gson;
import com.ironhack.model.User;
import net.datafaker.Faker;

public class Main {
    public static void main(String[] args) {

        Faker faker = new Faker();
        Gson gson = new Gson();


        System.out.println("Hello " + faker.funnyName().name());
        System.out.println(faker.yoda().quote());

        User user = new User("salva", "salva@mail.com");
        String userAsJson = gson.toJson(user);
        System.out.println(userAsJson);
        User user2 = gson.fromJson(userAsJson, User.class);
        System.out.println(user2.getName());
    }
}