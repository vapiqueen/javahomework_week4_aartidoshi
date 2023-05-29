package javahomework_week4_aartidoshi;

import java.util.Scanner;

/**
 * Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */

public class Program_9_FibonacciNumber {

    public static void isFibonacci(int number) {
        int n1 = 0, n2 = 1, n3;
        System.out.println(n1 +  " " + n2);
        //loop starts from 2 because 0 and 1 are already printed
        for (int i = 2; i < number; ++i) {
            n3 = n1 + n2;
            System.out.println(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading the input form the console
        Scanner S9 = new Scanner(System.in);
        System.out.println("Input Fibonacci number count: ");
        isFibonacci(S9.nextInt());
        //Closing scanner
        S9.close();
    }
}
