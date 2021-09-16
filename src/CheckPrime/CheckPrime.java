package CheckPrime;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        System.out.println("Check the number is prime? Enter the number and check it");
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = inputNumber.nextInt();
        boolean flag = true;

        if (number < 2) {
           flag = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
        }

        if (!flag) {
            System.out.printf("%d is not the Prime", number);
        } else {
            System.out.printf("%d is the Prime", number);
        }
    }
}
