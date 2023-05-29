package javahomework_week4_aartidoshi;

import java.util.Scanner;

/**Display right angle triangle of @ using nested for loops
 @
 @@
 @@@
 @@@@
 @@@@@
 */

public class program_8_SymbolTriangle {

    public static void symbolTriangle(int a) {
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("@");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Scanner declaration for reading input form console
        Scanner s8 = new Scanner(System.in);
        System.out.println("chhose the number of rows: ");
        symbolTriangle(s8.nextInt());
        // closing the scanner object
        s8.close();
    }
}


