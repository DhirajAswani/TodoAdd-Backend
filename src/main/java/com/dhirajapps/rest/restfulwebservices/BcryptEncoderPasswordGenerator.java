package com.dhirajapps.rest.restfulwebservices;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderPasswordGenerator {

    public static void main(String[] args){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

        for(int i=1 ; i<=10 ; i++ ) {
            String encodedString = encoder.encode("dhiraj");
            System.out.println(encodedString);
        }
    }
}
