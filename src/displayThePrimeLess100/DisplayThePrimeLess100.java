package displayThePrimeLess100;

import java.util.Scanner;

public class DisplayThePrimeLess100 {
    public static void main(String[] args) {
        System.out.println("Authority: Ngyuyen Hoang Duy");
        System.out.println("Exercise: Display the Prime less 100:");
        Scanner inputMax = new Scanner(System.in);
        System.out.println("Enter the number whose primes are less than this number:");
        int max = inputMax.nextInt();
        int N = 2;
        while (N < max) {
            if (!checkPrime(N)) {
                System.out.printf("%d, ", N);
            }
            N++;
        }

    }
    public static boolean checkPrime(int N) {
        boolean flag = false;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                flag = true;
                break;
            }
        }
        return flag;

    }
}
