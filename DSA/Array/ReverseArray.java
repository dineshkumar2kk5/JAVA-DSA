import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        
        
        int [] Array={10,20,30,40,50};
        int temp=0;
        int start=0;
        int end =(Array.length-1);

        while (start<end) {

            temp=Array[start];

            Array[start]=Array[end];

            Array[end]=temp;

            start++;
            end--;


            
            
        }
          System.out.println(Arrays.toString(Array));




        }




    }
