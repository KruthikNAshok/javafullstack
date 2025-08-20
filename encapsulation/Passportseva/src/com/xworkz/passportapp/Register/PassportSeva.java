package com.xworkz.passportapp.Register;

import com.xworkz.passportapp.User.PassportOne;

public class PassportSeva {

    PassportOne passportOne;

    public boolean createPassportUser(PassportOne passportOne) {
        boolean isUserValid=false;
        boolean cpvLocationValid = false;
        boolean givenNameValid = false;
        boolean givenOfficeValid = false;
        boolean givenSurNameValid=false;
        boolean givenEmailId=false;
        boolean isAddressValid=false;
        boolean isDobValid=false;
        boolean isLoginId=false;
        boolean isHintQuestion=false;

        if (passportOne.getCpvLocation() != null) {
            cpvLocationValid = true;
        } else {
            System.out.println("cpv location is not valid");
        }

        if (passportOne.getName() != null) {
            givenNameValid = true;
        } else {
            System.out.println("name is not valid");
        }
        if (passportOne.getPassportOffice() != null) {
            givenOfficeValid=true;
        } else {
            System.out.println("office is not valis");

        }

        if(passportOne.getAddress()!=null){
            isAddressValid=true;
        }else {
            System.out.println("not valid");
        }
        if(passportOne.getDob()!=null){
            isDobValid=true;
        }
        else {
            System.out.println("not valid");
        }
        if(passportOne.getLoginId()!=null){
            isLoginId=true;
        }
        else {
            System.out.println("not valid");
        }
        if(passportOne.getHintQuestion()!=null){
            isHintQuestion=true;
        }else{
            System.out.println("not valid");
        }



        if(passportOne.getSurName()!=null){
            givenSurNameValid=true;
        }else {
            System.out.println("surname is not valis");

        }
        if(passportOne.getEmailId()!=null){
            givenEmailId=true;
        }
        else {
            System.out.println("not valid");
        }
        if(givenNameValid && cpvLocationValid && givenOfficeValid && givenSurNameValid && givenEmailId && isAddressValid && isDobValid && isLoginId && isHintQuestion){
            System.out.println("user created successfully");
            isUserValid=true;
            this.passportOne=passportOne;
        }else{
            System.out.println("not valid");
        }
        return isUserValid;
    }


}