import java.util.HashMap;
import java.util.Scanner;

public class Hash1 {

    public static void main(String[] args) {
        
    //     HashMap <Integer,Integer> macha=new HashMap<>();


    //     macha.put(2, 4);
    //     macha.put(3, 6);

        
    //   int add=macha.get(3);
    //   macha.put(3,add+1);
    //     System.out.println(macha.get(3));


Scanner input= new Scanner(System.in);

    int n=input.nextInt();



    HashMap <Integer,Integer> macha=new HashMap<>();

    macha.put(2, 4);

    macha.put(5, 10);
    
    if (macha.containsKey(n)){

        int add=macha.get(n);

        macha.put(n,1+add);

       
        
    }

    else{

        macha.put(n, 14);
    }
    System.out.println(macha.get(n));
  

    


    
    

        

    }

    
}
