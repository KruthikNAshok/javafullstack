package com.xworkz.amazon.Amazon2;

import com.xworkz.amazon.Amazon1.AmazonUser;

public class AmazonBackend {

    AmazonUser amazonUser=new AmazonUser();

    public boolean getUserDetails(AmazonUser amazonUser){

         boolean isLoginIdValid=false;
         boolean isName=false;
         boolean isPhoneNumberValid=false;
         boolean isPasswordValid=false;
         boolean isCnfPwdValid=false;
         boolean isUserValid=false;

         if(amazonUser.getLoginId()!=null){
             isLoginIdValid=true;
         }else {
             System.out.println("enter valid login id");
         }

         if(amazonUser.getName()!=null){
             isName=true;
         }else {
             System.out.println("not valid");
         }

         if(amazonUser.getPhoneNumber()!=0){
             isPhoneNumberValid=true;
         }else {
             System.out.println("not valid");
         }
         if(amazonUser.getPassword()!=null){
             isPasswordValid=true;
         }else{
             System.out.println("not valid");

         }

         if(amazonUser.getCnfPwd()!=null){
             isCnfPwdValid=true;
         }else {
             System.out.println("not valid");

         }
         if(amazonUser.getPassword()==amazonUser.getCnfPwd()){

             if(isLoginIdValid&& isPasswordValid && isName && isPhoneNumberValid && isCnfPwdValid){
                 System.out.println("user is valid");
                 isUserValid=true;
             }
             else {
                 System.out.println("not valid");

             }


         }else {
             System.out.println("password is incorrect");
         }
        return  isUserValid;
    }
}
