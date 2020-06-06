package com.prasadct.factoryMethodPattern;
import com.prasadct.factoryMethodPattern.model.BankAccount;
import com.prasadct.factoryMethodPattern.model.factory.ForeignBankAccountFactory;
import com.prasadct.factoryMethodPattern.model.factory.LocalBankAccountFactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = null;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter\n" +
                        " P for Personal account\n" +
                        " B for Business account\n" +
                        " C for Checking account\n" +
                "----------------------------");

        String type = in.nextLine();

        Scanner inputBranch = new Scanner(System.in);

        System.out.println("Please enter\n" +
                " 1 for Local\n" +
                " 2 for Foreign\n" +
                "----------------------------");

        int branch = inputBranch.nextInt();

        if (branch == 1) {
            Branch localBranch = new Branch(new LocalBankAccountFactory());
            bankAccount = localBranch.createBankAccount(type);
        } else if (branch == 2) {
            Branch foreignBranch = new Branch(new ForeignBankAccountFactory());
            bankAccount = foreignBranch.createBankAccount(type);
        }
    }

}
