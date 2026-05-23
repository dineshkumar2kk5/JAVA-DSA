
public class SumArray {

    public static int sum(int[] array,int index){
        if (index==array.length){
            return 0;
        }
        return array[index]+sum(array, index+1);

    }
    public static void main(String[] args) {
        int[] array={10,20,30,40};

        int res=sum(array,0);

        System.out.println(res);


    }
    
}
