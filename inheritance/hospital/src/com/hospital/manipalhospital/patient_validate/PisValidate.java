package com.hospital.manipalhospital.patient_validate;
import com.hospital.manipalhospital.patient_details.PatientDetails;

public class PisValidate {





        PatientDetails details;

        public boolean validated(PatientDetails details){
            boolean valid=false;

            boolean validAdmit=false;
            boolean validAdd=false;
            boolean validCareTaker=false;
            boolean validId=false;
            boolean validDesease=false;
            boolean validNo=false;
            boolean validName=false;

            if(details.getpIsAdmitt()){
                validAdmit=true;
            }else{
                System.out.println("Ivalid Admit Details..!");
            }

            if(details.getpAddress() != null && !details.getpAddress().isEmpty()){
                validAdd=true;
            }else{
                System.out.println("Inavlid Address");
            }

            if(details.getpCareTaker() !=null && !details.getpCareTaker().isEmpty()){
                validCareTaker=true;
            }else{
                System.out.println("Invalid Care Taker");
            }

            if (details.getpId() > 0){
                validId=true;
            }else{
                System.out.println("InValid Id");
            }

            if(details.getpDeseas() != null && !details.getpDeseas().isEmpty())
            {
                validDesease=true;
            }else{
                System.out.println("Invalid Desease");
            }

            if (details.getpMNo() >0){
                validNo=true;
            }else{
                System.out.println("Invalid Phone Number");
            }

            if(details.getpName() != null && !details.getpName().isEmpty()){
                validName=true;
            }else{
                System.out.println("Invalid Name");
            }

            if (validId && validNo && validAdd && validDesease && validName && validCareTaker && validAdmit ){
                this.details=details;
                valid=true;
            }
            return valid;
        }

        public void getPatientInfo(){

            System.out.println("Patient Id :"+details.getpId());
            System.out.println("Patient Name :"+details.getpName());
            System.out.println("Patient Address :"+details.getpAddress());
            System.out.println("Patient Care Taker :"+details.getpCareTaker());
            System.out.println("Patient Mobile number :"+details.getpMNo());
            System.out.println("Patient Desease :"+details.getpDeseas());
            System.out.println("Patient Is Admitt :"+details.getpIsAdmitt());

        }
    }

