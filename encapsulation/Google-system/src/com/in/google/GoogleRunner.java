package com.in.google;

import com.in.google.register.Registration;
import com.in.google.validation.GoogleValid;



public class GoogleRunner {
    public static void main(String []args){

        Registration registration=new Registration();

        registration.setFname("kruthik");
        registration.setLname("Ashok");
        registration.setEmail("kruthik@gmail.com");
        registration.setGender("Male");

        registration.setDob("05-08-2002");
        registration.setPwd("kruthik@123");
        registration.setCpwd("kruthik@123");

        GoogleValid val=new GoogleValid();
        if( val.isUserCreated(registration)){



        System.out.println("first name is "+ registration.getFname());
        System.out.println("last name is "+ registration.getLname());
        System.out.println("Email is "+ registration.getEmail());
        System.out.println("Gender is "+ registration.getGender());
        System.out.println("DOB is "+ registration.getDob());
        System.out.println("password is  "+ registration.getPwd());
        System.out.println("confirm password is "+ registration.getCpwd());
        }
        else {
            System.out.println("results are not valid");
        }






    }

}
