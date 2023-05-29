package javahomework_week4_aartidoshi;

/**Shared Digit
* Write a method named hasSharedDigit with two parameters of type int.
* Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not
 within the range, the method should return false.
*The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
 otherwise, the method should return false.
 *EXAMPLE INPUT/OUTPUT:
 * hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
 * hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
 * hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
 NOTE: The method hasSharedDigit should be defined as public static
 */

public class Program_13_SharedDigit {
    public static boolean hasSharedDigit(int Number1 , int Number2) {
        if ((Number1 >= 10 && Number1 <= 99) && (Number2 >= 10 && Number2 <= 99)) {
            int Number1LastDigit = Number1 % 10;
            int Number2LastDigit = Number2 % 10;
            Number1 /= 10;
            Number2 /= 10;
            int Number1FirstDigit = Number1;
            int Number2FirstDigit = Number2;
            return ((Number1FirstDigit == Number2FirstDigit) ||
                    (Number1FirstDigit == Number2LastDigit) ||
                    (Number1LastDigit == Number2FirstDigit)||
                    (Number1LastDigit == Number2LastDigit));
            }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12 , 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15,55));
    }
}

