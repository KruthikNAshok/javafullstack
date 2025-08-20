package com.xworkz.amazon;

import com.xworkz.amazon.Amazon1.AmazonUser;
import com.xworkz.amazon.Amazon2.AmazonBackend;

public class AmazonRunner {
    public static void main(String[] args) {
        AmazonUser amazonUser=new AmazonUser();

        amazonUser.setLoginId("kruthik");
        amazonUser.setName("kruthik");
        amazonUser.setPassword("kruthik@123");
        amazonUser.setCnfPwd("kruthik@123");
        amazonUser.setPhoneNumber(9878767);
        amazonUser.setPhoneNumber(7744582);


        AmazonBackend amazonBackend=new AmazonBackend();
        boolean result=amazonBackend.getUserDetails(amazonUser);

        if(result){
            System.out.println("login id "+amazonUser.getLoginId());
            System.out.println("name "+amazonUser.getName());
            System.out.println("password "+amazonUser.getPassword());
            System.out.println("confirm password "+amazonUser.getCnfPwd());
            System.out.println("phone number "+amazonUser.getPhoneNumber());

        }else {
            System.out.println("user is not valid");
        }

    }
}
