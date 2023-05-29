package javahomework_week4_aartidoshi;

import java.util.Scanner;

/**
 * Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */

public class Program_10_ArmStrongNumber {

    public static void isArmStrongNumber(int n) {
        int num, arm, rem = 0;
        num = n;
        while (n != 0) {

            arm = n % 10;
            rem = rem + arm * arm * arm;
            n /= 10;

        }
        if (rem == num) {
            System.out.println(num + "is an Armstrong Number");
        } else {
            System.out.println(num + "is not an Armstrong Number");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration
        Scanner S10 = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int a = S10.nextInt();
        isArmStrongNumber(a);
        //closing the scanner
        S10.close();
    }
}

