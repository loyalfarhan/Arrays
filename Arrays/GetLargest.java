package Arrays;

// find the largest number in given array

public class GetLargest {
    public static int GetLargest(int numbers[]){
        int largest= Integer.MIN_VALUE; //-infinity

        int smalest= Integer.MAX_VALUE;

        for(int i=0; i<numbers.length;i++){
           if( largest<numbers[i]){
            largest=numbers[i];

        }
        if(smalest>numbers[i]){
            smalest=numbers[i];
        }

    }
    System.out.println("smalest value is:"+ smalest);
    return largest;
}
    public static void main(String[] args) {
        int numbers[]={1, 5, 6, 9,6};
        System.out.println("largest value is "+ GetLargest(numbers));
        
    }

}
