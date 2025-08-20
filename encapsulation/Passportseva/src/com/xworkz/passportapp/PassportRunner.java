package com.xworkz.passportapp;

import com.xworkz.passportapp.Register.PassportSeva;
import com.xworkz.passportapp.User.PassportOne;

public class PassportRunner {
    public static void main(String[] args) {
        PassportOne passportOne=new PassportOne();
        passportOne.setCpvLocation("bengaluru");
        passportOne.setPassportOffice("bengaluru");
        passportOne.setName("kk");
        passportOne.setSurName("hiremath");
        passportOne.setEmailId("kk@123gmai.com");
        passportOne.setAddress("ckm");
        passportOne.setDob("12-04-2002");
        passportOne.setLoginId("kk@123gmai.com");
        passportOne.setHintQuestion("enter your city");

        System.out.println("cpv location is "+passportOne.cpvLocation);
        System.out.println("passport office "+passportOne.passportOffice);
        System.out.println(("name "+passportOne.name));
        System.out.println("surname is "+passportOne.surName);
        System.out.println("email id "+passportOne.getEmailId());
        System.out.println("address:-"+passportOne.getAddress());

        PassportSeva passportSeva=new PassportSeva();


        passportSeva.createPassportUser(passportOne);







    }
}