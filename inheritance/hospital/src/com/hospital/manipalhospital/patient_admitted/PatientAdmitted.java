package com.hospital.manipalhospital.patient_admitted;
import com.hospital.manipalhospital.patient_details.PatientDetails;
import com.hospital.manipalhospital.patient_validate.PisValidate;

public class PatientAdmitted {





        PatientDetails details;



        public boolean isAdmitted(PatientDetails details){
            boolean validated=false;

            PisValidate val =new PisValidate();

            boolean result= val.validated(details);

            if(result ){
                this.details=details;
                validated=true;
                val.getPatientInfo();
            }
            else{
                System.out.println("This is Not A Valid Patient...!");
            }
            return validated;
        }
    }

