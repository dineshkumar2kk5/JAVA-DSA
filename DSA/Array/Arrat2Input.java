import java.util.Scanner;

public class Arrat2Input {

    public static void main(String[] args) {

        int array[] = new int[8];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {

            array[i] = scan.nextInt();
        }

        for (int i = 0; i < array.length; i++) {

            System.out.println(array[i]);
        }
    }
}