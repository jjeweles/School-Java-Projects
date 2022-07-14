package com.company;

import javax.swing.*;
//import java.util.Scanner;

public class BankApp {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
        int menuOption;
        double balance = 0;
        boolean exit = false;
        double amt;

        do {
            menuOption = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Deposit Money\n 2. Withdraw Money\n 3. Check Your Balance\n 0. Quit Application\n Choose your option: \n",
                    "Main Menu", JOptionPane.QUESTION_MESSAGE));
//            System.out.println("1. Deposit Money");
//            System.out.println("2. Withdraw Money");
//            System.out.println("3. Check Your Balance");
//            System.out.println("0. Quit Application");
//            System.out.print("Choose your option: ");
//            menuOption = in.nextInt();
            switch (menuOption) {
                case 1 -> {
                    // Deposit Money
                    amt = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to deposit?", "Deposit Amount", JOptionPane.QUESTION_MESSAGE));
//                    System.out.println("How much would you like to deposit?");
//                    amt = in.nextDouble();
                    if (amt <= 0) {
                        JOptionPane.showMessageDialog(null, "Cannot deposit negative amount.", "Error", JOptionPane.ERROR_MESSAGE);
//                        System.out.println("Cannot deposit negative amount.");
                    } else {
                        balance += amt;
                        JOptionPane.showMessageDialog(null, "Deposit successful! $" + amt + " has been accepted.\nCurrent balance is:\n" + "$" + balance,
                                "Deposit Successful", JOptionPane.INFORMATION_MESSAGE);
/*
                        System.out.println("Deposit successful! $" + amt + " has been accepted.\n");
                        System.out.println("Current balance is:\n" + "$" + balance);
*/
                    }
                }
                case 2 -> {
                    // Withdraw Money
                    amt = Double.parseDouble(JOptionPane.showInputDialog(null, "How much would you like to withdraw?", "Withdraw Amount", JOptionPane.QUESTION_MESSAGE));
//                    System.out.println("How much would you like to withdraw?");
//                    amt = in.nextDouble();
                    if (amt > balance || amt <= 0) {
                        JOptionPane.showMessageDialog(null, "Insufficient funds or negative amount entered.", "Error", JOptionPane.ERROR_MESSAGE);
//                        System.out.println("Insufficient funds or negative amount entered.");
                    } else {
                        balance -= amt;
                        JOptionPane.showMessageDialog(null, "Withdraw successful! $" + amt + "has been dispensed.\nCurrent balance is:\n" + "$" + balance,
                                "Withdraw Successful", JOptionPane.INFORMATION_MESSAGE);
/*
                        System.out.println("Withdraw successful! $" + amt + " has been dispensed.\n");
                        System.out.println("Current balance is:\n" + "$" + balance);
*/
                    }
                }
                case 3 ->
                        // Check Balance
                        JOptionPane.showMessageDialog(null, "Your current balance is: $" + balance, "Current Balance", JOptionPane.INFORMATION_MESSAGE);
//                        System.out.println("Your current balance is: $" + balance);
                case 0 -> {
                    // quit
                    JOptionPane.showMessageDialog(null, "Thanks for banking with us!\n", "Exit", JOptionPane.INFORMATION_MESSAGE);
//                    System.out.println("Thanks for banking with us!\n");
                    exit = true;
                }
                default ->
                        // Error Handling
                        JOptionPane.showMessageDialog(null, "Invalid Selection! Please Try Again.", "Invalid Selection", JOptionPane.ERROR_MESSAGE);
//                        System.out.println("Invalid Selection, Please Try Again.");
            }
            System.out.println();
        } while (!exit);
    }
}
