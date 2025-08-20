package com.hospital.manipalhospital;



import com.hospital.manipalhospital.patient_admitted.PatientAdmitted;
import com.hospital.manipalhospital.patient_details.PatientDetails;

    public class HospitalRunner {
        public static void main(String[] args) {

            PatientDetails details = new PatientDetails();

            details.setpName("Raju");
            details.setpAddress("Hvr");
            details.setpId(101);
            details.setpCareTaker("Brother");
            details.setpIsAdmitt(true);
            details.setpMNo(826893);
            details.setpDeseas("Fever");

            PatientAdmitted admitted = new PatientAdmitted();
            boolean v = admitted.isAdmitted(details);
            if (v) {
                System.out.println("Patient Admitted Successfully ....!");
            }

        }
    }


