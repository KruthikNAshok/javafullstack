package com.hospital.manipalhospital.patient_details;



    public class PatientDetails {


        private int pId;
        private String pName;
        private String pAddress;
        private String pCareTaker;
        private int pMNo;
        private String pDeseas;
        private boolean pIsAdmitt;

        public void setpId(int id){
            this.pId=id;
        }
        public int getpId(){
            return pId;
        }

        public void setpName(String name){
            this.pName=name;
        }
        public String getpName(){
            return pName;
        }

        public void setpAddress(String add){
            this.pAddress=add;
        }
        public String getpAddress(){

            return pAddress;
        }
        public void setpCareTaker(String care){
            this.pCareTaker=care;
        }
        public String getpCareTaker(){
            return pCareTaker;
        }

        public void setpMNo(int no){
            this.pMNo=no;
        }
        public int getpMNo()
        {
            return pMNo;
        }

        public void setpDeseas(String desease){
            this.pDeseas=desease;
        }
        public String getpDeseas(){
            return pDeseas;
        }

        public void setpIsAdmitt(boolean admitt){
            this.pIsAdmitt=admitt;
        }
        public boolean getpIsAdmitt(){
            return pIsAdmitt;
        }



    }


