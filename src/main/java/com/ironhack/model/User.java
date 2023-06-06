package com.ironhack.model;

import org.apache.commons.codec.binary.Base64;

public class User {

    private String name;

    private String username; // name, trimmed, and if there are space it will be lower_ and lower case (Salva Corsaro -> salva_corsaro)
    private String password;
    private String email;



    public User(String name, String password, String email){
        setName(name);
        this.password = password;
        this.email = email;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim().toUpperCase();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String createUsername(){
        return name.trim().toLowerCase().replace(" ", "_");
    }




}
