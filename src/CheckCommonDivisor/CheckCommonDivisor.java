package CheckCommonDivisor;

import java.util.Scanner;

public class CheckCommonDivisor {
    public static void main(String[] args) {
        System.out.println("Check the Max of common divisor of two number, Enter two number:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = input.nextInt();
        System.out.println("Enter the second number:");
        int num2 = input.nextInt();
        int max = 1;
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0 && num2 % i == 0 && i > max) {
                max = i;
            }
        }
        System.out.printf("The Greatest common divisor of %d and %d is %d ", num1, num2, max);
    }
}
