/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validate;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class CheckInputValid {

    private static Scanner inp = new Scanner(System.in);

    //check input is int 
    private static int checkInputInt() {
        int number = 0;
        while (number <= 0) {
            try {
                number = Integer.parseInt(inp.nextLine());
                if (number <= 0) {
                    System.err.println("Please input number > 0");
                }
            } catch (NumberFormatException e) {
                System.err.println("Re-Input");
            }
        }
        return number;
    }

    // input array bill
    public static int[] inputBills() {
        System.out.print("Input number of bill:");
        int size = checkInputInt();
        int[] bills = new int[size];

        for (int i = 0; i < bills.length; i++) {
            System.out.println("input value of bill" + (i + 1) + ":");
            bills[i] = checkInputInt();
        }

        return bills;
    }

    // input wallet
    public static int inputWallet() {
        System.out.println("input value of wallet:");
        int wallet = checkInputInt();
        return wallet;
    }

}
