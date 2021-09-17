package display20Prime;


public class Display20Prime {
    public static void main(String[] args) {
        System.out.println("The app can display the first 20 Prime");
        Prime(20);

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
                System.out.println(N);
                N++;
            } else {
                N++;
            }
        }
    }

}
