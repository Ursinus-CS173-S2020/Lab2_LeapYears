/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_leapyears;
import java.util.Scanner;

/**
 *
 * @author ctralie
 */
public class Lab2_LeapYears {

    public static boolean isALeapYear(int year) {
        boolean isLeap = false;
        // TODO: Add logic here
        return isLeap;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a year: ");
        int year = in.nextInt();
        if (isALeapYear(year)) {
            System.out.println("It's a leap year");
        }
        // TODO: Print "It's not a leap year" otherwise
    }
    
}
