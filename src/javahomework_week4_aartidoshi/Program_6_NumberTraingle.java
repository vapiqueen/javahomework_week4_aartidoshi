package javahomework_week4_aartidoshi;

import java.util.Scanner;

/**Write a program in Java to display the pattern like a triangle with a number.
 For eg.
 *Input number of rows: 10
 *Expected Output:
 *1
 *12
 *123
 *1234
 *12345
 *123456
 *1234567
 *12345678
 *123456789
 *12345678910
 */

public class Program_6_NumberTraingle {
    public static void numTriangle(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner s6 = new Scanner(System.in);
        System.out.println("Input number of rows: ");
        //calls static method
        numTriangle(s6.nextInt());
        // closing the scanner object
        s6.close();
    }
}


