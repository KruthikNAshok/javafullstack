package com.xworkz.amazon.Amazon1;

public class AmazonUser {

    private String loginId;
    private String name;
    private long phoneNumber;
    private String password;
    private String CnfPwd;

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCnfPwd() {
        return CnfPwd;
    }

    public void setCnfPwd(String cnfPwd) {
        CnfPwd = cnfPwd;
    }
    public boolean updatePhonNumber(long phoneNumber){
        boolean isPhoneNumberUpdated=false;

        if(phoneNumber>0){
            .setPhoneNumber(phoneNumber);


        }
        return isPhoneNumberUpdated;
    }
}
