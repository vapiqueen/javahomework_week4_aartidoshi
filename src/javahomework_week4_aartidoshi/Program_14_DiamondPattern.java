package javahomework_week4_aartidoshi;

import java.util.Scanner;

/**Write a program in Java to display the pattern like a diamond.
     *   While loop
             *
             ***
            *****
           *******
          *********
         ***********
        *************
         ***********
          *********
           *******
            *****
             ***
              *
 *
 */

public class Program_14_DiamondPattern {
    public static void printDiamond(int a, char ch) {
        int i = 1;
        int j;
        while (i <= a) {
            j = 1;
            while (j++ <= a - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i++;
        }
        i = a - 1;
        while (i > 0) {
            j = 1;
            while (j++ <= a - i) {
                System.out.print(" ");
            }
            j = 1;
            while (j++ <= i * 2 - 1) {
                System.out.print(ch);
            }
            System.out.println();
            i--;
        }
    }
    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number of row : ");
        int b = scanner.nextInt();
        System.out.print("Enter the symbol : ");
        char c = scanner.next().charAt(0);
        printDiamond(b, c);
        // closing the scanner object
        scanner.close();
    }
}