/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jp60;

import entity.Wallet;
import entity.Person;
import validate.CheckInputValid;

/**
 *
 * @author ADMIN
 */
public class Jp60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Read the bills and the money available in the user's wallet.
        int[] bills = CheckInputValid.inputBills();
        int walletAmount = CheckInputValid.inputWallet();

        Person person = new Person(walletAmount);
        printTotalAndResult(bills, person);
    }

    public static void printTotalAndResult(int[] bills, Person person) {
        Wallet wallet = person.getWallet();
        int total = wallet.calcTotal(bills);
        System.out.println("Total of bills: " + total);
        if (wallet.payMoney(total)) {
            System.out.println("You can pay for the bills.");
        } else {
            System.out.println("You cannot pay for the bills.");
        }
    }
}
