public class Reverse {

    public static boolean palindrome(String p, int left, int right) {

        // Base condition
        if (left >= right) {
            return true;
        }

        // If characters are not equal
        if (p.charAt(left) != p.charAt(right)) {
            return false;
        }

        // Recursive call
        return palindrome(p, left + 1, right - 1);
    }

    public static void main(String[] args) {

        int num = 1211;

        String p = String.valueOf(num);

        boolean res = palindrome(p, 0, p.length() - 1);

        if (res==true) {

            System.out.println("it is a Palindrome");
            
        }

        else{
            System.out.println("it not a Palindrome");
        }

    }
}