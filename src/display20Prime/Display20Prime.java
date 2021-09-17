package display20Prime;


import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        System.out.println("The app can display the first number Prime which you want:");
        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Enter number of Prime you want to display:");
        int number = inputNumber.nextInt();
        Prime(number);

    }

    public static void Prime(int number) {
        int count = 0;
        int N = 2;

        while (count < number) {
            boolean flag = false;
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
                System.out.print(N + ", ");
                N++;
            } else {
                N++;
            }
        }
    }

}
