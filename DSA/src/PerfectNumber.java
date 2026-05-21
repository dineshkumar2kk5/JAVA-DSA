


public class PerfectNumber {
    public static void main(String[] args) {

        int n = 36;
        int sum = 1;

        for (int i = 2; i * i <= n; i++) {

            if (n % i == 0) {

                if (n / i != i) {

                    sum = sum + i;
                    sum = sum + (n / i);

                } else {

                    sum = sum + i;
                }
            }
        }

        System.out.println("Sum = " + sum);

        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not Perfect Number");
        }
    }
}