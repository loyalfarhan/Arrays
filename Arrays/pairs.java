package Arrays;

public class pairs {
    public static void printpairs(int numbers[]){

        for(int i=0; i<numbers.length; i++){
            int curr= numbers[i];
            for(int j=i+1; j<numbers.length; j++) {

                System.out.print("("+curr+","+numbers[j]+")");


            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int numbers[]={3,5,6,8,9};
        printpairs(numbers);
    }
}
