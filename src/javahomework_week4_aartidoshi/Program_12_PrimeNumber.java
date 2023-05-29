package javahomework_week4_aartidoshi;

import java.util.Scanner;

/**Write a programme to input any number and check if it is prime or not.
 *(Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 17.... are the prime numbers.)
 */
public class Program_12_PrimeNumber {
    public static void isPrimeNumber(int n){
        boolean a = false;
        for(int i = 2; i <=n / 2; ++i){
            if (n % i == 0) {
                a = true;
                break;
            }
        }
        if (!a)
            System.out.println(n + "is a prime number");
        else
            System.out.println(n + "is not a prime number");
    }

    public static void main(String[] args) {
        //Scanner declaration
        Scanner s12 = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int b = s12.nextInt();
        isPrimeNumber(b);
        //closing scanner
        s12.close();
    }
}
