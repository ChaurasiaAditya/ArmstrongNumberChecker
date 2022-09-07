/*
 * Author Name: Aditya Chaurasia
 * Date: 07-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");

        // Store the input in a variable
        int num = sc.nextInt();

        // call the method
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();


    }
    /**
     * This method checks if the given number is an Armstrong number.
     * An Armstrong number is a number that is the sum of its own digits raised to the power of the number of digits.
     * Example, Armstrong number: 153 (number of digits is 3) <br>
     * 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153. <br>
     *
     * @param number the number to be checked.
     * @return true if the number is an Armstrong number, false otherwise.
     */
    public boolean isArmstrong(int number) {
        int sum = 0;
        int copy = number;
        while (copy != 0 && copy != -1) {
            int remainder = copy % 10;
            sum = sum + (remainder * remainder * remainder);
            copy = copy / 10;
        }
        return sum == number;
    }
}
