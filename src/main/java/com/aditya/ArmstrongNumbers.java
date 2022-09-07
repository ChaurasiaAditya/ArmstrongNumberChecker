/*
 * Author Name: Aditya Chaurasia
 * Date: 07-09-2022
 * Created With: IntelliJ IDEA Community Edition
 */
package com.aditya;

public class ArmstrongNumbers {
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
