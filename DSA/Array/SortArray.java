public class SortArray {

    public static void main(String[] args) {

        int array[] = {5, 2, 8, 1, 9};

        // Sorting array in ascending order
        for (int i = 0; i < array.length; i++) {

            for (int j = i; j < array.length; j++) {

                if (array[i] > array[j]) {

                    // swap
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        // Print sorted array
        System.out.println("Sorted Array:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}