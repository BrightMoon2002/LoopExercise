package Drawmenu2;

import java.util.Scanner;

public class DrawMenu2 {
    public static void main(String[] args) {
        System.out.println("Draw the Polygon you choose, Choose the number in the menu:");
        Scanner menu = new Scanner(System.in);

        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu:");
            System.out.println("1. Draw the triangle top left:");
            System.out.println("2. Draw the triangle top right:");
            System.out.println("3. Draw the triangle bot left:");
            System.out.println("4. Draw the triangle bot right:");
            System.out.println("5. Draw the isosceles triangle:");
            System.out.println("6. Draw the square:");
            System.out.println("7. Draw the rectangle:");
            System.out.println("0. Exit.");
            choice = menu.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Draw the top left triangle:");
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Draw the bot left triangle:");
                    for (int i = 5; i > 0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Draw the top right triangle:");
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Draw the bot right triangle:");
                    for (int i = 5; i >= 1; i--) {
                        for (int j = 1; j <= 5; j++) {
                            if (j <= 5 - i) {
                                System.out.print("   ");
                            } else {
                                System.out.print(" * ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Draw the isosceles triangle:");

                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j < 2 * 5; j++) {
                            if (Math.abs(5 - j) <= (i - 1)) {
                                System.out.print(" * ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Draw the square:");
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 7:
                    System.out.println("Draw the rectangle:");
                    for (int i = 1; i < 4; i++) {
                        for (int j = 1; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
