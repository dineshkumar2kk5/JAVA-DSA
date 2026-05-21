public class Armstrongnumber {
    public static void main(String[] args) {

        int n=1538;
        int temp=n;
        int value=0;

        while (n>0) {

        int rem=n%10;
        int cube =rem*rem*rem;
        int stored =cube;

         value =value+stored;

          n=n/10;
        }

        if (temp==value) {

            System.err.println("The Arm Strong value is "+value);        
        }
        else{
            System.err.println("It is not a  Arm Strong value is "+value);  

        }
             
        
    }
}
