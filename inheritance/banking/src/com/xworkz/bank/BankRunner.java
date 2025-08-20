package com.xworkz.bank;

import com.xworkz.bank.bankaccount.BankAccount;

public class BankRunner {
    public static void main(String[]args){
    BankAccount kruthikAccount = new BankAccount();
    kruthikAccount.credit(20000.00);
    BankAccount friendAccount =new BankAccount();
    kruthikAccount.transfer(friendAccount,2000.00);
    System.out.println("avail bal"+kruthikAccount.getBalance());
    System.out.println("balance of friends account "+friendAccount.getBalance());
}
}
