public class Stringreverse {

    public static void main(String[] args) {

        String ans="";

 String s="abashdndu";

 boolean palindrom=true;


        for(int i=s.length()-1;i>0;i--){


            if (s.charAt(i)!=s.charAt(s.length()-i-1)) {

                palindrom=false;

                System.out.println(s.charAt(s.length()-i-1));


                
            }
            
            
        }
        if (palindrom==false) {

                System.out.println("is a palidrom");
                
            }
        else{
            System.out.println("not palidrom");
        }







    //         ans=ans+s.charAt(i);
    //     }
    //     System.out.println(ans);

    //      // string palindrom or not 

    // if (ans.equals(s)){

    //     System.out.println("yes");

    // }
    // else{
    //     System.out.println("no");
    // }
        
    }

   



}