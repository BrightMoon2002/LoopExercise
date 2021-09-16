package Interest;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        System.out.println("You can check the interest, Enter the loan, month, interest rate:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Loan:");
        double loan = input.nextInt();
        System.out.println("Enter the interest rate:");
        double rate = input.nextInt();
        System.out.println("Enter the Month:");
        int month = input.nextInt();
        double total = 0;

        for (int i = 0; i < month; i++) {
            total += loan * (rate / 100) / 12 * month;
        }
        System.out.println("The interest is " + total);
    }
}
