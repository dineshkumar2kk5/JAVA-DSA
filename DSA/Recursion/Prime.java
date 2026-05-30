import java.util.Scanner;

class Prime {

    public static int pr(int n, int i) {

        // Base condition
        if (i*i>n) {
            return 1;
        }

        // Not prime
        if (n % i == 0) {
            return 0;
        }

        // Recursive call
        return pr(n, i + 1);
    }

    public static void main(String[] args) {

        int i = 2;

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int res = pr(n, i);

        if (res == 1) {
            System.out.println("It is a prime number");
        } else {
            System.out.println("It is not a prime number");
        }

    }
}