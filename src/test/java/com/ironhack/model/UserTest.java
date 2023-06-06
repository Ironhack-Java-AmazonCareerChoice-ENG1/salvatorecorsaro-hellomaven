package com.ironhack.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserTest {

    public static final String USER_PASSWORD = "roma123";
    private User userToTest;

    @BeforeEach
    public void setup(){
        userToTest = new User("Tizio",USER_PASSWORD, "tizio@virgilio.it");
    }


    @Test
    @DisplayName("Testing new User creation")
    public void testNewUser(){
        assertNotNull(userToTest);
        assertEquals("TIZIO", userToTest.getName());
        assertEquals("tizio@virgilio.it", userToTest.getEmail());
    }

    @Test
    @DisplayName("Testing new User creation - trimmed")
    public void testNewUserTrimmed(){
        User userToTest2 = new User("   Lilly Giuliani   ", "newyork", "lilly@ny.com");
        assertNotNull(userToTest2);
        assertEquals("LILLY GIULIANI", userToTest2.getName());
        assertEquals("lilly@ny.com", userToTest2.getEmail());
    }

    @Test
    public void testUserPassword(){
        assertEquals(USER_PASSWORD, userToTest.getPassword());
    }

    @Test
    public void testSetUserPassword(){
        userToTest.setPassword("PassW0rD#@");
        assertEquals("PassW0rD#@", userToTest.getPassword());
    }

    @Test
    public void testUsernameCreation(){
        String username = userToTest.createUsername();
        assertEquals("tizio", username);
    }

    @Test
    public void testUsernameCreationFullName(){
        User userToTest2 = new User("Lilly Giuliani", "newyork", "lilly@ny.com");
        String username = userToTest2.createUsername();
        assertEquals("lilly_giuliani", username);
    }

    @Test
    public void testUsernameCreationFullNameTrimmed(){
        User userToTest2 = new User("   Lilly Giuliani   ", "newyork", "lilly@ny.com");
        String username = userToTest2.createUsername();
        assertEquals("lilly_giuliani", username);
    }



}