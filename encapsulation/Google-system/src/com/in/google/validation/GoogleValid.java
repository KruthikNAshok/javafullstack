package com.in.google.validation;

import com.in.google.register.Registration;

public class GoogleValid {

    Registration register;

    public boolean isUserCreated(Registration register) {

        boolean FnameValid = false;
        boolean LnameValid = false;
        boolean EmailValid = false;
        boolean GenderValid = false;
        boolean DobValid = false;
        boolean PwdValid = false;
        boolean CpwdValid = false;

        boolean UserIsCreated =false;


        if (register.getFname() != null) {
            FnameValid = true;
        } else {
            System.out.println("not valid");

        }
        if (register.getLname() != null) {
            LnameValid = true;
        } else {
            System.out.println("not valid");

        }

        if (register.getEmail() != null) {
            EmailValid = true;
        } else {
            System.out.println("not valid");

        }
        if (register.getGender() != null) {
            GenderValid = true;
        } else {
            System.out.println("not valid");

        }

        if (register.getDob() != null) {
            DobValid = true;
        } else {
            System.out.println("not valid");

        }
        if (register.getPwd() != null) {
            PwdValid = true;
        } else {
            System.out.println("not valid");

        }
        if (register.getCpwd() != null) {
            CpwdValid = true;
        } else {
            System.out.println("not valid");

        }
        if (FnameValid && LnameValid && EmailValid && GenderValid && DobValid && PwdValid && CpwdValid) {
            UserIsCreated = true;
            this.register = register;
        }
        return UserIsCreated;


    }
}
