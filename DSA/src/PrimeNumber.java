public class PrimeNumber {
    
    public static void main(String[] args) {
        int n=13;
        int count =0;

        for(int i=2;i*i<=n;i++){

            if (n%i==0){

                count=count+1;


            }

        }
        System.out.println(count);

    }
}
