package Arrays;

public class subArrays {
    public static void printsubArrays(int numbrs[]){

    
    for(int i= 0; i<numbrs.length; i++){
         int start =i;
         for(int j=i; j<numbrs.length; j++){
            int end=j;
            for(int k=start; k<=end; k++){
                System.out.print(numbrs[k]+" ");
            }
            System.out.println();

         }
         System.out.println();
    }
    }
    public static void main(String[] args) {
        int numbers[]= {2,4,6,8};
        printsubArrays(numbers);
    }
}
