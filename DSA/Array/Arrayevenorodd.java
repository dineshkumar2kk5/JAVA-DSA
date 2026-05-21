public class Arrayevenorodd {
    public static void main(String[] args) {
        

        int even=0;
        int odd=0;
        int [] array={23,24,53,43,24};

        for (int i : array) {

            if (i%2==1) {
                even=+i;
                 System.out.println(even);
                
            }
            else{
                
                odd=+odd;
                 System.out.println(odd);
            
            }

            
        }
    }
}
