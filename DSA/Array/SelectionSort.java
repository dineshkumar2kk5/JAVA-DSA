public class SelectionSort{
    public static void main(String[] args) {

          int[] arr={2,5,4,3,6};
        int start=0;
        int end=arr.length-1;
        int temp=0;

      

        for(int i=start;i<end;i++){

            int min=i;


            for(int j=i+1;j<arr.length;j++){

                if (arr[j]>arr[min]) {

                    min=j;

                    


                    
                }

                    temp=arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;


                   
            }

        }
        for (int num : arr) {

            System.out.println(num);
            
        }
       
        
    }
}