public class Gcd {

    public static void main(String[] args) {

        int n1 = 12;
        int n2 = 18;

        int a=n1;
        int b=n2;
        int lcm=a*b;


        while (n1 > 0 && n2 > 0) { 
            
            // here is n1=12; n1>0 is 12,11,10,9,8,7,6,5,4,3,2,1, is stop same at the; n2= 18 also

            // afer full iterarion you get sign the n1=0,n2=6

            if (n1 > n2) {

                n1 = n1 % n2;

            } else {

                n2 = n2 % n1;

            }
        }

        if (n1 == 0) {
            
            System.out.println("GCD is " + lcm/n2);
        } else {
            System.out.println("GCD is " + lcm/n1);
        }

        

    }
} 