class Sorted {

    public static boolean sr(int arr[], int i) {

        // Base condition
        if (i >= arr.length - 1) {
            return true;
        }

        // Check sorting or operation
        if (arr[i] > arr[i + 1]) {
            return false;
        }

        // Recursive call
        return sr(arr, i + 1);
    }

    public static void main(String[] args) {

        int[] arr = {1, 2,3,4,5};

        boolean res = sr(arr, 0);

        System.out.println(res);
    }
}