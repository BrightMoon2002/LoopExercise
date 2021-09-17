package display20Prime;


import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        System.out.println("The app can display the first number Prime which you want:");
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter number of Prime you want to display:");
        int number = inputNumber.nextInt();
        int count = 0;
        int N = 2;
        while (count < number) {
            if (Prime(N)) {
                count++;
                System.out.printf("%d, ", N);
            }
            N++;
        }
    }

    public static boolean Prime(int number) {
       boolean flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            return flag;
        }
    }


