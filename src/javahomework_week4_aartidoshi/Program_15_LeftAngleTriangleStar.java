package javahomework_week4_aartidoshi;

import java.util.Scanner;

/**  Display left angle triangle of * using nested for loops
 *
 * *
 * * *
 * * * *
 * * * * *
 */

public class Program_15_LeftAngleTriangleStar {

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows : ");
        int b = scanner.nextInt();
        leftTriangle(b);
        // closing the scanner object
        scanner.close();
    }


    public static void leftTriangle(int a) {
        int i, j;
        for (i = 1; i <= a; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}



